package seleniumBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class NTDAUT_Reg {
	
	static WebDriver driver;
	
	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial11236549");
		System.out.println("This is fine");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial1");
		System.out.println("This is fine");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("This is fine");
		driver.findElement(By.name("userName")).click();
		System.out.println("This is fine");
		driver.findElement(By.name("userName")).clear();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial1");
		driver.findElement(By.name("password")).sendKeys("tutorial1");
		driver.findElement(By.name("login")).click();
		System.out.println("This is fine");
		
		Select drppass = new Select(driver.findElement(By.name("passCount")));
		drppass.selectByVisibleText("4");
		
		Select drpFrom = new Select(driver.findElement(By.name("fromPort")));
		drpFrom.selectByVisibleText("London");
	}

}
