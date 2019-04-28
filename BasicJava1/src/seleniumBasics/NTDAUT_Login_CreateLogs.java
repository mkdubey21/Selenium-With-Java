package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

import com.sun.deploy.uitoolkit.impl.fx.Utils;

public class NTDAUT_Login_CreateLogs {
	
	static WebDriver driver;
	
	public static void main(String [] args){
		
		try{
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\BasicJava1\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		// Printing logs for my report
		//Log.error("Report Category button element is not found.");
		
		System.out.println("1 - Step done");
		
		//Thread.sleep(4000);
		driver.findElement(By.name("userName")).sendKeys("tutorial1");
		driver.findElement(By.name("password")).sendKeys("tutorial1");
		
		// Taking screenshot for defect reporting
		// Utils.captureScreenShot();

		driver.findElement(By.name("login")).click();
				
		}
		catch(Exception e)
		{
			System.out.println("Ëxception raised:"+e.toString());
		}
		finally
		{
			System.out.println("Test Completed");
		}
		
		driver.quit();
	}
	

}
