package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LKIT_ListBox {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://learn.letskodeit.com/");
		driver.get("https://learn.letskodeit.com/p/practice");
		
		
		//System.out.println("Lets Click on Practice link");
		//driver.findElement(By.linkText("Practice")).click();
		System.out.println("Landed on Practice Page");
		//Thread.sleep(3000);
				
			
		//Lets Try for List Boxes Option
		Select carFromListBox = new Select(driver.findElement(By.id("multiple-select-example")));
		carFromListBox.selectByVisibleText("Apple");
		System.out.println("You have Selected Apple from List Box");
		Thread.sleep(2000);
		carFromListBox.selectByIndex(2);
		System.out.println("You have Selected Peach from List Box");
		Thread.sleep(2000);
		System.out.println("List Box Tests Ran Successfully");
		
		System.out.println("Test for Check Box has been Ran Successfully");
		Thread.sleep(3000);
		//driver.quit();
		
	}

}

