package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {
	
	static WebDriver driver;
	
	public static void main(String [] args){
		//System.setProperty("webdiver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers.chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Lets start");
		
		driver.get("http://google.co.in");
		//driver.get("http://newtours.demoaut.com");
		
		
		
	}

}