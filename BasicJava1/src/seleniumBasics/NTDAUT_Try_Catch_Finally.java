package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTDAUT_Try_Catch_Finally {
	
	static WebDriver driver;
	
	public static void main(String [] args){
		
		try{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		System.out.println("1 - Step done");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("tutorial1");
		driver.findElement(By.name("password")).sendKeys("tutorial1");
		driver.findElement(By.name("login")).click();
				
		}
		catch(Exception e)
		{
			System.out.println("Ëxception raised:"+e.toString());
			driver.findElement(By.name("userName")).sendKeys("tutorial1");
			System.out.println("Login Entered");
			driver.findElement(By.name("pass")).sendKeys("tutorial1");
			System.out.println("Password Entered");
			driver.findElement(By.name("login")).click();
			System.out.println("You Clicked on Submit");
			System.out.println("Test is NOT Completed");
			System.out.println("Ëxception raised:"+e.toString());
		}
		
		/*
		 catch(Exception e2)
		 
		{
			System.out.println("Ëxception raised:"+e2.toString());
			driver.findElement(By.name("userName")).sendKeys("tutorial1");
			System.out.println("Login Entered");
			driver.findElement(By.name("pass")).sendKeys("tutorial1");
			System.out.println("Password Entered");
			driver.findElement(By.name("login")).click();
			System.out.println("You Clicked on Submit");
			System.out.println("Test is NOT Completed");
			//System.out.println("Ëxception raised:"+e.toString());
		}
		*/
		finally
		{
			driver.findElement(By.name("userName")).sendKeys("tutorial1");
			System.out.println("Login Entered");
			driver.findElement(By.name("pass")).sendKeys("tutorial1");
			System.out.println("Password Entered");
			driver.findElement(By.name("login")).click();
			System.out.println("You Clicked on Submit");
			System.out.println("Test is Completed");
		}
		
		System.out.println("Test Completed");
		driver.quit();
	}
	

}

