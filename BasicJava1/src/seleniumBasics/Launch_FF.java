package seleniumBasics;

//
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//
public class Launch_FF {
	static WebDriver driver;
	
	public static void main(String [] args){
		System.setProperty("WebDriver.gecko.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\geckodriver.exe");
				
		driver = new FirefoxDriver();
		//driver.get("https://google.co.in");
				driver.get("http://newtours.demoaut.com/");
				
				String title = driver.getTitle();
				System.out.println("----------------------------------");
				System.out.println("The Title of Website is: "+title);
				System.out.println("----------------------------------");
				String targeturl = "http://newtours.demoaut.com/";
				String targeturl_other = "http://newtours.demoaut.com1/";
				String expectedurl_ylogged = "http://newtours.demoaut.com/mercuryreservation.php";
				//String expectedurl_nlogged = "http://newtours.demoaut.com/1mercuryreservation.php";
				String url = driver.getCurrentUrl();
				String url_yl = driver.getCurrentUrl();
				System.out.println("Current URL of Website is: "+url);
				System.out.println("Target 	URL of Website is: "+targeturl);
				
				int result = targeturl.compareToIgnoreCase(url);
				int result1 = targeturl_other.compareToIgnoreCase(url);
				int result2 = expectedurl_ylogged.compareToIgnoreCase(url_yl);
				
				if (result == 0)
					{
					System.out.println("This is correct URL");
					}
					else
					{
						System.out.println("This is Wrong URL");
					}
				System.out.println("----------------------------------");
				System.out.println("Current URL of Website is: "+url);
				System.out.println("Target  URL of Website is: "+targeturl_other);
					if (result1 == 0)
					{
					System.out.println("This is correct URL");
					}
					else
					{
						System.out.println("This is Wrong URL");
					} 
				//driver.close();
				
				System.out.println("--------------------");
				
				driver.findElement(By.name("userName")).click();
				driver.findElement(By.name("userName")).clear();
				driver.findElement(By.name("userName")).sendKeys("tutorial1");
				
				driver.findElement(By.name("password")).click();
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("tutorial1");
				
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				driver.findElement(By.name("login")).click();
				
				System.out.println("----------------------------------");
				
				System.out.println("Expected Login page of Website is: "+expectedurl_ylogged);
				System.out.println("Current page of Website is: "+url_yl);
					if (result2 == 0)
					{
					System.out.println("This Have logged in Successfully");
					}
					else
					{
						System.out.println("This is Wrong URL");
					}
						
				System.out.println("Your Test ran Successfully");
				
				//CLick on link Sign Out
				driver.findElement(By.linkText("SIGN-OFF")).click();
				
				driver.findElement(By.name("userName")).click();
				driver.findElement(By.name("userName")).clear();
				driver.findElement(By.name("userName")).sendKeys("tutorial2");
				
				driver.findElement(By.name("password")).click();
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("tutorial2");
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
				driver.findElement(By.name("login")).click();
				
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//CLick on Home
				driver.findElement(By.linkText("Home")).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//CLick on Home
				driver.findElement(By.linkText("Flights")).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//CLick on Home
				driver.findElement(By.linkText("Hotels")).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
				System.out.println("Your Test ran Successfully");
				
				driver.close();

		}
}
