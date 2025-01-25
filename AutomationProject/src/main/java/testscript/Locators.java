package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void id() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));// to locate webElement
		WebElement id1=driver.findElement(By.id("single-input-field"));
		WebElement id2=driver.findElement(By.id("button-one"));
		WebElement id3=driver.findElement(By.id("message-one"));
		WebElement id4=driver.findElement(By.id("value-a"));
		
	}
		
public void className() {
			//WebElement elementname=driver.findElement(By.Locator("locator value"));// to locate webElement
			WebElement classname1=driver.findElement(By.className("clearfix"));
			WebElement classname2=driver.findElement(By.className("header-top"));
			WebElement classname3=driver.findElement(By.className("mb-sec"));
			
		}
	
public void name() {
	
	WebElement name1=driver.findElement(By.name("viewport"));
	WebElement name2=driver.findElement(By.name("description"));
	WebElement name3=driver.findElement(By.name("author"));

	
}

public void linkText() {
	
	WebElement text1=driver.findElement(By.linkText("Simple Form Demo"));
	WebElement text2=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement text3=driver.findElement(By.linkText("Radio Buttons Demo"));
}

public void partialLinkText() {
	
	WebElement partailtext1=driver.findElement(By.partialLinkText("Simple Form"));
	WebElement partailtext2=driver.findElement(By.partialLinkText("Checkbox"));
	WebElement partailtext3=driver.findElement(By.partialLinkText("Radio Buttons"));
}

}
