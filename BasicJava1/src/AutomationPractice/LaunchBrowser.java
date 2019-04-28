package AutomationPractice;

//import javax.security.auth.Subject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	
	static WebDriver driver;
	
	public static void main(String [] args){
		
		//System.setProperty("driver.chrome.driver", "")
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("http://automationpractice.com/index.php");
		driver.get("http://automationpractice.com/");
		System.out.println("App is Launched");
		
		//Click on Contact us
		driver.findElement(By.linkText("Contact us")).click();
		
		//Click on drop down
		driver.findElement(By.name("id_contact")).click();
		
		Select drpsubhead = new Select(driver.findElement(By.id("id_contact")));
		drpsubhead.selectByVisibleText("Webmaster");
		
		
		//Subject drpSubHead = new Subject();
		/*
		
		Select drpCars = new Select(driver.findElement(By.id("carselect")));
		drpCars.selectByVisibleText("Honda");
		Thread.sleep(3000);
		System.out.println("Drop Down Selected as: Honda");
		*/
	
	}

}
