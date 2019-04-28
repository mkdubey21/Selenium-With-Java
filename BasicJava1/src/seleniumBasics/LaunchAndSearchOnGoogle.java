package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndSearchOnGoogle {
	static WebDriver driver;
		
	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://google.co.in");
		System.out.println("You have Launched the Chrome and Opened the google");
		driver.findElement(By.name("q")).sendKeys("Test Automation");

		//driver.findElement(By.name("q")).sendKeys("");
				
	}

}
