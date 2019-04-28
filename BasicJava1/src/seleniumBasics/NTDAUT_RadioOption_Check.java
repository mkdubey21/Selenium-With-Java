package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTDAUT_RadioOption_Check {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\BasicJava1\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//System.out.println("1 - Step done");
		
		Thread.sleep(4000);
		driver.findElement(By.name("userName")).sendKeys("tutorial1");
		driver.findElement(By.name("password")).sendKeys("tutorial1");
		driver.findElement(By.name("login")).click();
		
		WebElement trip_Round = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font"));
		//trip_Round.click();
		
		WebElement trip_Oneway = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		trip_Oneway.click();
		Thread.sleep(2000);
		
		boolean selected_Trip_Round = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font")).isEnabled();
		System.out.println(selected_Trip_Round);
		
		//boolean selected_Trip_Oneway = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).isEnabled();
		//System.out.println(selected_Trip_Oneway);
		
		//driver.quit();
	}
	

}

