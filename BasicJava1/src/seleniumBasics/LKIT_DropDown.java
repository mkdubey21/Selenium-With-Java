package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LKIT_DropDown {
	
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
		
		//Lets Try for Drop Down Option
		
		//Assign and Select the dropdown list element
        Select selectDropdown = new Select(driver.findElement(By.id("carselect")));
       
        //Get all the option from dropdown list and assign into List
        List<WebElement> listOptionDropdown = selectDropdown.getOptions();
       
        // Count the item dropdown list and assign into integer variable
        int dropdownCount = listOptionDropdown.size();
        System.out.println("Site is Open");
        //Print the total count of dropdown list using integer variable
        System.out.println("Total Number of item count in dropdown list = "  + dropdownCount);
        
        //
        Select allOptionsFromDd = new Select(driver.findElement(By.id("carselect")));
        //Select allOptionsFromDd = new Select(driver.findElement(By.xpath("//select[@id='carselect']")));
        																//*[@id="carselect"]
        allOptionsFromDd.getOptions();
        System.out.println(allOptionsFromDd.getOptions());
        
        
		Select drpCars = new Select(driver.findElement(By.id("carselect")));
		drpCars.selectByVisibleText("Honda");
		Thread.sleep(3000);
		System.out.println("Drop Down Selected as: Honda");
		
		driver.findElement(By.xpath("//select[@id='carselect']"));
		drpCars.selectByVisibleText("BMW");
		Thread.sleep(3000);
		System.out.println("Drop Down Selected as: BMW");
	
		driver.findElement(By.name("cars")).click();
		drpCars.selectByVisibleText("Benz");
		Thread.sleep(3000);
		System.out.println("Drop Down Selected as: Benz");
		
		
		System.out.println("Drop Down Tests Ran Successfully");
		
		System.out.println("Test for Drop Down Box has been Ran Successfully");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}

