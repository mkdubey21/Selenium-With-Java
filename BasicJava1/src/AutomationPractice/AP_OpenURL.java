package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AP_OpenURL {
	
	static WebDriver driver;
	static String MainURL = "http://automationpractice.com";
	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Sel_Java\\BasicJava1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(MainURL);
	}

}
