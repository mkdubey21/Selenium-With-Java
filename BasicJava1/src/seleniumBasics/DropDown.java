package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver", arg1);
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://learn.letskodeit.com/p/practice");
		
		driver.manage().window().fullscreen();
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Nothing is to display");
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Rerurned to Main Page");
		
		//Select drpcars = Select(driver.findElement(By.id("selectcars")));
		
		Select drpCars = new Select(driver.findElement(By.id("carselect")));
		drpCars.selectByVisibleText("Honda");
		Thread.sleep(3000);
	//	System.out.println("You have Selected as:"+drpCars.selectByVisibleText("Honda"));
		System.out.println("Thank You, This is All About");
		
	}

}
