package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_Item_Drodown {
		
		static WebDriver driver;
       public static void main(String[] args) {
             
    	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
   		driver = new ChromeDriver();
   		
   		//driver.get("http://housejoy.in/");
   		driver.get("https://learn.letskodeit.com/p/practice");
   		
   		driver.manage().window().maximize();
    	System.out.println("Site is Open");
       
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
        System.out.println("Thank You");
       
       }
}