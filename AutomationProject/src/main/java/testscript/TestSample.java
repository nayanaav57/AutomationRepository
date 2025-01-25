package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base{
public void getText() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement id1=driver.findElement(By.id("single-input-field"));
	id1.sendKeys("hello");
	WebElement id2=driver.findElement(By.id("button-one"));
	id2.click();
	
}

public void getValue() {
	
	WebElement id4=driver.findElement(By.id("value-a"));
	id4.sendKeys("5");
	WebElement tagclassattribute3=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	tagclassattribute3.sendKeys("10");
	WebElement text2= driver.findElement(By.xpath("//button[text()='Get Total']"));
	text2.click();
}

	public static void main(String[] args) {
		
		TestSample test =new TestSample ();
		test.initializebrowser();
		test.getText();
		test.getValue();
		//test.driverQuitandClose();
		

	}

}
