package demo_NTDAUT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTDAUT_SiteVisit {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException{
		
		System.out.println("Lets Open the URL");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(3000);
		String ExpUrl = "http://newtours.demoaut.com";
		
		String Title = driver.getTitle();
		System.out.println("Title of this page is: "+Title);
		String ActualUrl = driver.getCurrentUrl();
		
		int compUrl = ExpUrl.compareToIgnoreCase(ActualUrl);
		
			if(compUrl == 0)
			{
				System.out.println("You have Open the Correct URL");
			}
			else
			{
				System.out.println("Sorry, You have Landed to the Wrong URL and this NOT Correct URL");
			}
		
		//Lets Click on Home Link
		driver.findElement(By.linkText("Home")).click();
		System.out.println("You have Clicked on the "+"Home"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on Flights Link
		driver.findElement(By.linkText("Flights")).click();
		System.out.println("You have Clicked on the "+"Flights"+" Link");
		Thread.sleep(3000);
				
		//Lets Click on Hotels Link
		driver.findElement(By.linkText("Hotels")).click();
		System.out.println("You have Clicked on the "+"Hotels"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on Car Rentals Link
		driver.findElement(By.linkText("Car Rentals")).click();
		System.out.println("You have Clicked on the "+"Car Rentals"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on Cruises Link
		driver.findElement(By.linkText("Cruises")).click();
		System.out.println("You have Clicked on the "+"Cruises"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on Destinations Link
		driver.findElement(By.linkText("Destinations")).click();
		System.out.println("You have Clicked on the "+"Destinations"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on Vacations Link
		driver.findElement(By.linkText("Vacations")).click();
		System.out.println("You have Clicked on the "+"Vacations"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on SIGN-ON Link
		driver.findElement(By.linkText("SIGN-ON")).click();
		System.out.println("You have Clicked on the "+"SIGN-ON"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on REGISTER Link
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println("You have Clicked on the "+"REGISTER"+" Link");
		Thread.sleep(3000);
		
		//Lets Click on SUPPORT Link
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println("You have Clicked on the "+"SUPPORT"+" Link");
		Thread.sleep(3000);

		//Lets Click on CONTACT Link
		driver.findElement(By.linkText("CONTACT")).click();
		System.out.println("You have Clicked on the "+"CONTACT"+" Link");
		Thread.sleep(3000);
				
		driver.quit();
		System.out.println("Test Ran Successfully!");
		System.out.println("All Links are working fine, Test Ran Successfully!, Thank You.");
	}

}
