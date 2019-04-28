package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndSearch {
	
	static WebDriver driver;

	public static void main(String [] args){
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new ChromeDriver();
		driver.get("https://google.com");
		
		System.out.println("You Launched Google.co.in");
		
		driver.findElement(By.className("q")).sendKeys("Send");
	}

}