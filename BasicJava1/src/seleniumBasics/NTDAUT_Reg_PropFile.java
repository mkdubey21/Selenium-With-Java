package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class NTDAUT_Reg_PropFile {
	
	static WebDriver driver;
	//static WebDriver driver;
	
	public static void main(String [] args) throws IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println("You Clicked on Register link");
		//Contact Information
		
		Properties prop = new Properties();
		File propFile = new File(System.getProperty("user.dir")+"\\NTDAUT_RegDetails.properties");
		FileInputStream fs = new FileInputStream(propFile);
		prop.load(fs);
			
		String fn = prop.getProperty("1fn");
		String ln = prop.getProperty("2ln");
		String ph = prop.getProperty("3ph");
		String email = prop.getProperty("4email");
		String selCountry = prop.getProperty("5Country");
		String userId = prop.getProperty("6LoginID");
		
		//  Contact Information
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("lastName")).sendKeys(ln);
		driver.findElement(By.name("phone")).sendKeys(ph);
		driver.findElement(By.name("userName")).sendKeys(email);
		
		System.out.println("You have entered Contact Information Details");
		
		//Mailing Information
		driver.findElement(By.name("address1")).sendKeys("Test_Address1");
		driver.findElement(By.name("address2")).sendKeys("Test_Address2");
		driver.findElement(By.name("city")).sendKeys("Test_City");
		driver.findElement(By.name("state")).sendKeys("Test_State");
		driver.findElement(By.name("postalCode")).sendKeys("400710");
		
		Select ddcountry = new Select(driver.findElement(By.name("country")));
		ddcountry.selectByVisibleText(selCountry);
		Thread.sleep(3000);
		System.out.println("You have entered Mailing Information Details");
		
		//User Information
		driver.findElement(By.name("email")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys("mylogin1p");
		driver.findElement(By.name("confirmPassword")).sendKeys("mylogin1p");
		
		System.out.println("You have entered Login Details");
		
		driver.findElement(By.name("register")).click();
		System.out.println("You Clicked on submit button");
				
		//http://newtours.demoaut.com/create_account_success.php
		String act_succ_url = driver.getCurrentUrl();
		String exp_succ_url = "http://newtours.demoaut.com/create_account_success.php";
		
		int result1 = exp_succ_url.compareToIgnoreCase(act_succ_url);
		
		if(result1 == 0)
		{
			System.out.println("You have Completed Your Registration");
		}
		else
		{
			System.out.println("Sorry, You have NOT Completed Your Registration");
		}
		
		String message1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
		String message2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		String message3 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
				
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
		
		String [] conMessage = message1.split(" ");
		String [] conlogid = message3.split(" ");
		
		String fnstored = conMessage[1];
		String lnstored = conMessage[2].substring(0, conMessage[2].length()-1);
		String lidstored = conlogid[5].substring(0, conlogid[5].length()-1);
		
		//
		System.out.println("Your First Name Entered is: "+fn);
		System.out.println("Your First Name Stored is: "+fnstored);
		//
		System.out.println("Your Last Name Entered is: "+ln);
		System.out.println("Your Last Stored is: "+lnstored);
		//
		System.out.println("Your Login ID Entered is: "+userId);
		System.out.println("Your Login ID Stored is: "+lidstored);
		
		//String 
		int resultfn = fn.compareToIgnoreCase(lidstored);
		int resultln = ln.compareToIgnoreCase(lnstored);
		//String loginid = userId;
		int resultuserid = userId.compareToIgnoreCase(lidstored);
		
		System.out.println("------------------Validate the First Name");
		//Validate the First Name
		System.out.println("First Name Entered: "+fn);
		System.out.println("First Name  Stored: "+fnstored);
			if (resultfn == 0)
				{
					System.out.println("First Name is Correct");
				}
			else
				{
					System.out.println("First Name is NOT Matching");
				}
		
		//Validate the Last Name
			System.out.println("------------------Validate the Last Name");
		System.out.println("Last Name Entered: "+ln);
		System.out.println("Last Name  Stored: "+lnstored);
			if (resultln == 0)
				{
					System.out.println("Last Name is Correct");
				}
			else
				{
					System.out.println("Last Name is NOT Matching");
				}
		System.out.println("You have Done the Registration");
		
		//Validate the Login ID
		System.out.println("------------------Validate the Login ID");
		System.out.println("Login Entered: "+userId);
		System.out.println("Login  Stored: "+lidstored);
		
			if (resultuserid == 0)
				{
					System.out.println("You Login Id (userID) is :"+lidstored);
					System.out.println("This is Correct Login ID");
				}
			else
				{
					System.out.println("You have Entered the Incorrect Login Details");
				}
			
			
		System.out.println("You have Done the Registration and Completed this Test");
	
		driver.quit();
		System.out.println("You have Closed the Window, Thank You");
	}
	

}

