
package seleniumBasics;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Properties;
//import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.fastinfoset.sax.Properties;

public class NTDAUT_Login_PropFile {
	
	static WebDriver driver;
	//static WebDriver driver;
	
		public static void main(String [] args) throws InterruptedException, IOException{
		
		System.out.println("Lets Open the URL");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(3000);
		String ExpUrl = "http://newtours.demoaut.com";
		
		String Title = driver.getTitle();
		System.out.println("Title of this page is: "+Title);
		String ActualUrl = driver.getCurrentUrl();
		
		int compUrl = ExpUrl.compareToIgnoreCase(ActualUrl);
		
			if(compUrl == 0)
			{
				System.out.println("You have Open the Correct URL");
			}
			else
			{
				System.out.println("Sorry, You have Landed to the Wrong URL and this NOT Correct URL");
			}
	
			//Lets Click on Home Link
			driver.findElement(By.linkText("Home")).click();
			System.out.println("You have Clicked on the "+"Home"+" Link");
			Thread.sleep(3000);
			
			//driver.quit();
			Properties prop = new Properties();
			File file = new File(System.getProperty("user.dir")+"\\LoginDetails.properties");
			FileInputStream fs = new FileInputStream(file);
			prop.load(fs);
			
			String userName1 = prop.getProperty("userName");
			String pass1 = prop.getProperty("password");
			System.out.println("üsername: "+userName1);
			System.out.println("password: "+pass1);
			
			Thread.sleep(1000);
			
			/*
			driver.findElement(By.name("userName")).sendKeys(userName1);
			driver.findElement(By.name("password")).sendKeys(pass1);
			driver.findElement(By.name("login")).click();
			
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
			*/
			
			Properties prop2 = new Properties();
			File file2 = new File(System.getProperty("user.dir")+"\\NTDAUT_Login2.properties");
			FileInputStream fs2 = new FileInputStream(file2);
			prop2.load(fs2);
			
			String us2 = prop2.getProperty("userName2");
			String pass2 = prop2.getProperty("password2");
			
			driver.findElement(By.name("userName")).sendKeys(userName1);
			driver.findElement(By.name("password")).sendKeys(pass2);
			Thread.sleep(3000);
			driver.findElement(By.name("login")).click();
			
		
	}
	

}

