package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;//globally declared to get access in another class
  
	public void initializebrowser(){
		
		driver = new ChromeDriver();// to load driver
		//driver =new EdgeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/");//to launch url
		driver.manage().window().maximize();//to maximize the browser from default 
 
	}
	
	public void driverQuitandClose() {
		driver.close();
		//driver.quit();
	}
	public static void main(String[] args) {
		Base c =new Base();
		c.initializebrowser();
		//c.driverQuitandClose();
		

	}

}
