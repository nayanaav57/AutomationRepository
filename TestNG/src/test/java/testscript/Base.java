package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
		public WebDriver driver;//globally declared to get access in another class
	  @BeforeMethod
		public void initializebrowser(){
			
			driver = new ChromeDriver();// to load driver
			//driver =new EdgeDriver();
			//driver = new FirefoxDriver();
			driver.get("https://selenium.qabible.in/");//to launch url
			driver.manage().window().maximize();//to maximize the browser from default size 
		}
		//@AfterMethod
		public void driverQuitandClose() {
			driver.close();
			//driver.quit();
		}
		
}
