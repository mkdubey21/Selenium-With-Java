package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class HelpingTester_MultiCheckBox {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://learn.letskodeit.com/");
		driver.get("http://www.helpingtesters.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Practice")).click();
		
		System.out.println("Landed on Practice Page");
		
		//driver.manage().window().maximize();
		
		//Lets Try for Check Boxes Option
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/a/div")).click();
		//driver.findElement(By.ByPartialLinkText("Selenium Basic ")).click();
				
		System.out.println("Lets Select Check Boxes Option");
		driver.findElement(By.linkText("Checkbox")).click();
		
		//Select All
		//String labelBeforeClick = driver.findElement(By.id("checkall")).getText();
		//System.out.println("Label Before Click: "+labelBeforeClick);
		//Click now
		driver.findElement(By.id("checkall")).click();
		//To UnCheck
		String labelAfterClick = driver.findElement(By.id("checkall")).getText();
		System.out.println("Label Before Click: "+labelAfterClick);
		//Reset
		driver.findElement(By.id("checkall")).click();
		String labelAfterReset = driver.findElement(By.id("checkall")).getText();
		System.out.println("Label Before Click: "+labelAfterReset);
		
		
		System.out.println("Test for Check Box has been Ran Successfully");
		Thread.sleep(3000);
		
		//driver.quit();
		
	}

}


