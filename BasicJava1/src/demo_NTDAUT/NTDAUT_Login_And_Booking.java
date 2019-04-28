package demo_NTDAUT;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class NTDAUT_Login_And_Booking {
	
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
	
			//Lets Click on Home Link
			driver.findElement(By.linkText("Home")).click();
			System.out.println("You have Clicked on the "+"Home"+" Link");
			Thread.sleep(3000);
			
			//driver.quit();
			
			driver.findElement(By.name("userName")).sendKeys("tutorial1");
			driver.findElement(By.name("password")).sendKeys("tutorial1");
			driver.findElement(By.name("login")).click();
			
			//Book the OneWay Ticket
			
			System.out.println("Lets Select Radio Option for Oneway");
			WebElement selTripOne = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
			selTripOne.click();
			//Thread.sleep(3000);
			System.out.println("Trip OneWay Selected");
			
			System.out.println("Lets Select Radio Option for Round Trip");
			WebElement selRoundTrip = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
			selRoundTrip.click();
			//Thread.sleep(3000);
			System.out.println("selRoundTrip Selected");
			
			System.out.println("Lets Select Radio Option fro Oneway");
			WebElement selTripOne2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
			selTripOne2.click();
			//Thread.sleep(3000);
			System.out.println("Trip OneWay Selected");
			
			//
			Select drpPass = new Select(driver.findElement(By.name("passCount")));
			drpPass.selectByVisibleText("2");
			//Thread.sleep(3000);
			System.out.println("You have Selected Number of Passenger: 2");
			
			
			//
			Select drpDepFrom = new Select(driver.findElement(By.name("fromPort")));
			drpDepFrom.selectByVisibleText("New York");
			//Thread.sleep(3000);
			
			//
			Select drpDepOnMon = new Select(driver.findElement(By.name("fromMonth")));
			drpDepOnMon.selectByVisibleText("June");
			//Thread.sleep(3000);
			
			//
			Select drpDepOnDay = new Select(driver.findElement(By.name("fromDay")));
			drpDepOnDay.selectByVisibleText("22");
			Thread.sleep(3000);
			
			//
			Select drpArrival = new Select(driver.findElement(By.name("toPort")));
			drpArrival.selectByVisibleText("London");
			//Thread.sleep(3000);
			
			driver.findElement(By.name("findFlights")).click();
			Thread.sleep(3000);
			
			System.out.println("Lets Select Radio Option");
			WebElement selFlight = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]"));
			//
			selFlight.click();
			Thread.sleep(3000);
			System.out.println("Radio1 Selected");
			//
			//oneway.click();
			//Thread.sleep(3000);
			//System.out.println("Radio2 Selected");
			//
			System.out.println("Radio Selection Tests Ran Successfully");
							
			driver.findElement(By.name("reserveFlights")).click();
			
			//Purchase
			//First Passenger details
			driver.findElement(By.name("passFirst0")).sendKeys("Gary");
			driver.findElement(By.name("passLast0")).sendKeys("Trinh");
			
			//Second Passenger details
			driver.findElement(By.name("passFirst1")).sendKeys("Alex");
			driver.findElement(By.name("passLast1")).sendKeys("Briganza");
			
			//Card Details
			Select drpCreditCard = new Select(driver.findElement(By.name("creditCard")));
			drpCreditCard.selectByVisibleText("Visa");
			//Thread.sleep(3000);
			
			driver.findElement(By.name("creditnumber")).sendKeys("3456789012349988");
			Select drpCardExpMon = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
			drpCardExpMon.selectByVisibleText("12");
			
			Select drpCardExpYr = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
			drpCardExpYr.selectByVisibleText("2010");
			
			//Card Holder details
				driver.findElement(By.name("cc_frst_name")).sendKeys("Admin");
				driver.findElement(By.name("cc_mid_name")).sendKeys("Office");
				driver.findElement(By.name("cc_last_name")).sendKeys("USA");
			
			//Billing Address
				WebElement billAddChkBox = driver.findElement(By.name("ticketLess"));
				billAddChkBox.click();
				
				if (billAddChkBox.isSelected())
				{
					System.out.println("You have Selected the TicketLess Travel");
				}
				else
				{
					System.out.println("You have NOT Selected the TicketLess Travel");
				}
				
				
				//Billing Address details
				driver.findElement(By.name("billAddress1")).sendKeys("PALM BEACH ROAD");
				driver.findElement(By.name("billAddress2")).sendKeys("PARK STREET");
				driver.findElement(By.name("billCity")).sendKeys("PLAINSBORO");
				driver.findElement(By.name("billState")).click();
				driver.findElement(By.name("billState")).clear();
				driver.findElement(By.name("billState")).sendKeys("New jersy");
				driver.findElement(By.name("billZip")).click();
				driver.findElement(By.name("billZip")).clear();
				driver.findElement(By.name("billZip")).sendKeys("08536");
				//
				Select drpBillCountry = new Select(driver.findElement(By.name("billCountry")));
				drpBillCountry.selectByVisibleText("UNITED STATES");
			
							
			//Delivery Address
				WebElement delAddChkBox = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/font"));
				delAddChkBox.click();
				if (delAddChkBox.isSelected())
				{
					System.out.println("You have Selected Delivery Address Same as Billing Address");
				}
				else
				{
					System.out.println("You have NOT Selected Delivery Address Same as Billing Address");
				}
				
				driver.findElement(By.name("delAddress1")).sendKeys("SPRING ROAD");
				driver.findElement(By.name("delAddress2")).sendKeys("SALT LAKE STREET");
				driver.findElement(By.name("delCity")).sendKeys("PARK CITY");
				
				driver.findElement(By.name("delState")).click();
				driver.findElement(By.name("delState")).clear();
				driver.findElement(By.name("delState")).sendKeys("Philadelphia");
				
				driver.findElement(By.name("delZip")).click();
				driver.findElement(By.name("delZip")).clear();
				driver.findElement(By.name("delZip")).sendKeys("40332");
				//
				Select drpDelCountry = new Select(driver.findElement(By.name("delCountry")));
				drpDelCountry.selectByVisibleText("UNITED STATES");
				//Need to handle the Alert for UK
				//drpDelCountry.selectByVisibleText("UNITED KINGDOM");
				
				driver.findElement(By.name("buyFlights")).click();	
				
				driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img")).click();
				
					
						
			System.out.println("Tests Ran Successfully");
		
	}
	

}

