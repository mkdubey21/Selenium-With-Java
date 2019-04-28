package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LetsKodeIT_RadDropListCheckBox {
	
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
		
		//Lets Try for radio Option
		
		System.out.println("Lets Select Radio Option");
		WebElement bmwRadio1 = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio2 = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio3 = driver.findElement(By.id("hondaradio"));
		
		//
		bmwRadio1.click();
		Thread.sleep(3000);
		System.out.println("Radio1 Selected");
		//
		benzRadio2.click();
		Thread.sleep(3000);
		System.out.println("Radio2 Selected");
		//
		hondaRadio3.click();
		Thread.sleep(3000);
		System.out.println("Radio3 Selected");
		System.out.println("Radio Selection Tests Ran Successfully");
		
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
		//
		
		/*
		
		//Lets Try for List Boxes Option
		Select carFromListBox = new Select(driver.findElement(By.id("multiple-select-example")));
		carFromListBox.selectByVisibleText("Apple");
		System.out.println("You have Selected Apple from List Box");
		Thread.sleep(2000);
		carFromListBox.selectByIndex(2);
		System.out.println("You have Selected Peach from List Box");
		Thread.sleep(2000);
		System.out.println("List Box Tests Ran Successfully");
		
		
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
				if(bmwCheck1.isSelected())
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
				if(bmwCheck1.isSelected())
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
		*/
		driver.quit();
		
	}

}
