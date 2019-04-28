package demo_NTDAUT;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class NTDAUT_Login {
	
	static WebDriver driver;
	//static WebDriver driver;
	
		public static void main(String [] args) throws InterruptedException{
		
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
			
			driver.findElement(By.name("userName")).sendKeys("tutorial1");
			driver.findElement(By.name("password")).sendKeys("tutorial1");
			driver.findElement(By.name("login")).click();
			
			/*
			Properties obj = new Properties();					
		    String objfile = new FileInputStream(System.getProperty("user.dir")+"\\LoginDetails.properties");									
		    ((System) obj).load(objfile);
		    
		    driver.findElement(By.name(objfile
		    		
			System.out.println("Test Ran Successfully!");
			System.out.println("All Links are working fine, Test Ran Successfully!, Thank You.");
			
			/*
			 * driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();							
    		  driver.navigate().back();
			 */
		
	}
	

}

