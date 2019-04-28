package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LKIT_CheckBox {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://learn.letskodeit.com/");
		driver.get("https://learn.letskodeit.com/p/practice");
		
		
		//
		//System.out.println("Lets Click on Practice link");
		//driver.findElement(By.linkText("Practice")).click();
		System.out.println("Landed on Practice Page");
		//Thread.sleep(3000);
		
		//driver.manage().window().maximize();
		
		//Lets Try for Check Boxes Option
		
		System.out.println("Lets Select Check Boxes Option");
		WebElement bmwCheck1 = driver.findElement(By.id("bmwcheck"));
		WebElement benzCheck2 = driver.findElement(By.id("benzcheck"));
		WebElement hondaCheck3 = driver.findElement(By.id("hondacheck"));
		
		bmwCheck1.click(); 
			if(bmwCheck1.isSelected())
				{
				System.out.println("Check Box for BMW  as TRUE");
				}
			else
				{
				System.out.println("Check Box for BMW  as FALSE");
				}
		Thread.sleep(3000);
		bmwCheck1.click();
				if(bmwCheck1.isSelected())
				{
				System.out.println("Check Box for BMW  as TRUE");
				}
			else
				{
				System.out.println("Check Box for BMW  as FALSE");
				}
		Thread.sleep(3000);
		//
		benzCheck2.click();
				if(benzCheck2.isSelected())
				{
				System.out.println("Check Box for BENZ  as TRUE");
				}
				else
				{
				System.out.println("Check Box for BENZ  as FALSE");
				}

		Thread.sleep(3000);
		benzCheck2.click();
				if(benzCheck2.isSelected())
				{
				System.out.println("Check Box for BENZ  as TRUE");
				}
				else
				{
				System.out.println("Check Box for BENZ  as FALSE");
				}
		Thread.sleep(3000);
		//
		hondaCheck3.click();
				if(hondaCheck3.isSelected())
				{
				System.out.println("Check Box for HONDA  as TRUE");
				}
				else
				{
				System.out.println("Check Box for HONDA  as FALSE");
				}
		Thread.sleep(3000);
		hondaCheck3.click();
		
				if(hondaCheck3.isSelected())
				{
				System.out.println("Check Box for HONDA  as TRUE");
				}
				else
				{
				System.out.println("Check Box for HONDA  as FALSE");
				}
		System.out.println("Test for Check Box has been Ran Successfully");
		Thread.sleep(3000);
		
		//driver.quit();
		
	}

}

