package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AP_Contact {
	
	static WebDriver driver;
	static String MainURL = "http://Automationpractice.com";
	
	public static void main(String [] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(MainURL);
		 System.out.println("Main URL Opened");
		 
		 driver.manage().window().maximize();
		 System.out.println("Click on Contact us link");
		 
		 driver.findElement(By.linkText("Contact us")).click();
		 //
		 driver.findElement(By.id("id_contact")).click();
		 System.out.println("Click on Contact drop down");
		 
		 System.out.println("Select drop down value");
		 Select drpsubHead = new Select(driver.findElement(By.id("id_contact")));
		 drpsubHead.selectByVisibleText("Webmaster");
		 
		 driver.findElement(By.id("email")).sendKeys("test1.test2@test3.com");
		 driver.findElement(By.name("id_order")).sendKeys("Test_ORD1");
		 driver.findElement(By.name("message")).sendKeys("This is Test Order and my First Order");
		
		 System.out.println("Submit the page");
		 driver.findElement(By.name("submitMessage")).click();
		 
		 Thread.sleep(3000);
		 
		 String msg = driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
		 System.out.println(msg);
		 System.out.println("Your Test Ran Successfully");
		 
		 System.out.println("Let try for next Order");
		 
		 driver.findElement(By.linkText("Contact us")).click();
		 //
		 driver.findElement(By.id("id_contact")).click();
		 System.out.println("Click on Contact drop down");
		//String subHead = "drpSubHead";
		 System.out.println("Select drop down value");
		 Select drpsubHead1 = new Select(driver.findElement(By.id("id_contact")));
		 drpsubHead1.selectByIndex(2);;
		 
		 driver.findElement(By.id("email")).sendKeys("test3.test4@test5.com");
		 driver.findElement(By.name("id_order")).sendKeys("Test_ORD2");
		 driver.findElement(By.name("message")).sendKeys("This is Test Order and my Second Order");
		
		 System.out.println("Submit the page");
		 driver.findElement(By.name("submitMessage")).click();
		 
		 System.out.println("Your Test Ran Successfully");
		 
	
	}
	
	

}
