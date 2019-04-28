package demo_NTDAUT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTDAUT_UserRegistration {
	
	static WebDriver driver;
	//static WebDriver driver;
	
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
	
		System.out.println("Lets Start the Registration");
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println("You Clicked on Register link");
		//Contact Information
		driver.findElement(By.name("firstName")).sendKeys("Sachin");
		driver.findElement(By.name("lastName")).sendKeys("Sachin");
		driver.findElement(By.name("phone")).sendKeys("Sachin");
		driver.findElement(By.name("userName")).sendKeys("sachin.murkar@test.com");
		//Mailing Information
		driver.findElement(By.name("address1")).sendKeys("Test_Address1");
		driver.findElement(By.name("address2")).sendKeys("Test_Address2");
		driver.findElement(By.name("city")).sendKeys("Test_City");
		driver.findElement(By.name("state")).sendKeys("Test_State");
		driver.findElement(By.name("postalCode")).sendKeys("400710");
		
		Select ddcountry = new Select(driver.findElement(By.name("country")));
		ddcountry.selectByVisibleText("INDIA");
		
		//Select drpFrom = new Select(driver.findElement(By.name("fromPort")));
		//drpFrom.selectByVisibleText("London");
		
		//User Information
		driver.findElement(By.name("email")).sendKeys("mylogin1");
		driver.findElement(By.name("password")).sendKeys("mylogin1p");
		driver.findElement(By.name("confirmPassword")).sendKeys("mylogin1p");
		
		driver.findElement(By.name("register")).click();
		System.out.println("You Clicked on submit button");
		
		//http://newtours.demoaut.com/create_account_success.php
		String act_succ_url = driver.getCurrentUrl();
		String exp_succ_url = "http://newtours.demoaut.com/create_account_success.php";
		
		int result1 = exp_succ_url.compareToIgnoreCase(act_succ_url);
		
		if(result1 == 0)
		{
			System.out.println("You have Completed Your Registration");
		}
		else
		{
			System.out.println("Sorry, You have NOT Completed Your Registration");
		}
		
		/*
		//String login_url = "http://newtours.demoaut.com/create_account_success.php";
		driver.getCurrentUrl();
		
		driver.findElement(By.linkText("sign-in")).click();
		/*
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("mylogin1mylogin1");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).click();
		*/
		//driver.findElement(By.name("userName")).sendKeys("tutorial1");
		
		/*
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("mylogin1mylogin1");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).click();
		*/
		//driver.findElement(By.name("password")).sendKeys("tutorial1");
		//driver.findElement(By.name("login")).click();
		
		/*
		System.out.println("You have Logged in with Newly added user");
		
		//
		/*
		 driver.findElement(By.linkText("Home")).click();
		 */
		
		/*
		driver.findElement(By.name("userName")).sendKeys("tutorial2");
		driver.findElement(By.name("password")).sendKeys("tutorial2");
		driver.findElement(By.name("login")).click();
		*/ 
		/*
		System.out.println("You have Logged in with Newly added user");
		*/
		driver.quit();
		System.out.println("Test Ran Successfully!");
		System.out.println("Test Ran Successfully!, Thank You.");
		
	}
	

}

