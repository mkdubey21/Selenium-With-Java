package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTDAUT_LoginAndBooking {
	
	static WebDriver driver;
	
	public static void main(String [] args){
		
		//System.setProperty("webdriver.Chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		//driver.get("http://newtours.demoaut.com");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial1");
		driver.findElement(By.name("password")).sendKeys("tutorial1");
		//
		driver.findElement(By.name("login")).click();
		
		System.out.println("Logged in");

		
	}
	

}
