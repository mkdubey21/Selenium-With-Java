package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LKIT_RadioOption {
	
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
		
		Boolean Rad1 = bmwRadio1.isSelected();
		Boolean Rad2 = benzRadio2.isSelected();
		Boolean Rad3 = hondaRadio3.isSelected();
		
		System.out.println("--------------------------------------------------");
		System.out.println("NO Radio Options Selected, Now Check All Radio Options");
		
		System.out.println("Radio1 Selected: "+Rad1);
		System.out.println("Radio1 Selected: "+Rad2);
		System.out.println("Radio1 Selected: "+Rad3);
		
		//
		bmwRadio1.click();
		Thread.sleep(3000);
		System.out.println("--------------------------------------------------");
		System.out.println("Radio1 Selected, Now Check All Radio Options");
		
		boolean Rad11 = bmwRadio1.isSelected();
		boolean Rad12 = benzRadio2.isSelected();
		boolean Rad13 = hondaRadio3.isSelected();
		
		System.out.println("Radio1 Selected: "+Rad11);
		System.out.println("Radio2 Selected: "+Rad12);
		System.out.println("Radio3 Selected: "+Rad13);
		//
		benzRadio2.click();
		Thread.sleep(3000);
		System.out.println("--------------------------------------------------");
		System.out.println("Radio2 Selected, Now Check All Radio Options");
		
		boolean Rad21 = bmwRadio1.isSelected();
		boolean Rad22 = benzRadio2.isSelected();
		boolean Rad23 = hondaRadio3.isSelected();
		
		System.out.println("Radio1 Selected: "+Rad21);
		System.out.println("Radio2 Selected: "+Rad22);
		System.out.println("Radio3 Selected: "+Rad23);
		//
		hondaRadio3.click();
		Thread.sleep(3000);
		System.out.println("--------------------------------------------------");
		System.out.println("Radio3 Selected, Now Check All Radio Options");
		
		boolean Rad31 = bmwRadio1.isSelected();
		boolean Rad32 = benzRadio2.isSelected();
		boolean Rad33 = hondaRadio3.isSelected();
		
		System.out.println("Radio1 Selected: "+Rad31);
		System.out.println("Radio2 Selected: "+Rad32);
		System.out.println("Radio3 Selected: "+Rad33);
		
		System.out.println("Radio Selection Tests Ran Successfully");
		
		
		System.out.println("Test for Check Box has been Ran Successfully");
		Thread.sleep(3000);
		
		if (Rad33 = true)
		{
			bmwRadio1.click();
			Thread.sleep(3000);
		}
		else
		{
			benzRadio2.click();
			Thread.sleep(3000);
		}
	
		//driver.quit();
		
	}

}

