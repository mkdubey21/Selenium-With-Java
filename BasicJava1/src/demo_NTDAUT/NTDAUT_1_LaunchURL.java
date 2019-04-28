package demo_NTDAUT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTDAUT_1_LaunchURL {
	
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
		
		driver.quit();
		System.out.println("Test Ran Successfully!");
		System.out.println("Test Ran Successfully!, Thank You.");
	}

}
