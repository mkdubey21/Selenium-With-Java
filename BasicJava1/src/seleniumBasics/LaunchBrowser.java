package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public final class LaunchBrowser {
	
	static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		driver.quit();
		System.out.println("This is Closed now, Thank You");
		
		//http://newtours.demoaut.com/
}
}