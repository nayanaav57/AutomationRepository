package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MutipleWindowHandling extends Base {
	
	public void multipleWindowHandle() {
		
		driver.navigate().to("https://webdriveruniversity.com/");
		
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String parentwindow=driver.getWindowHandle();// return handle of current window
		System.out.println( parentwindow);// to print id or handle of parent window
		System.out.println("*********************************************");//to separate between the data that is printed in the console 
		Set<String> allwindow=driver.getWindowHandles();// return handle of opened windows

		for (String temp:allwindow) // for each loop to switch from one window to other window
		{
			System.out.println("windows"+ temp);// to print id of opened windows
			driver.switchTo().window(temp);// to go inside current window and perform any functions like get title,get current url etc
			System.out.println(driver.getTitle());// to print title 
			System.out.println(driver.getCurrentUrl());//to print current url
			System.out.println("*********************************************");
		}
	}

	public static void main(String[] args) {
		
		MutipleWindowHandling window=new MutipleWindowHandling();
		
		window.initializebrowser();
		window.multipleWindowHandle();
	}

}
