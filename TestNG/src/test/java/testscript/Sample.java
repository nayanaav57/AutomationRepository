package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Sample extends Base {
	@Test
	public void getText() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement id1=driver.findElement(By.id("single-input-field"));
		id1.sendKeys("hello");
		WebElement id2=driver.findElement(By.id("button-one"));
		id2.click();
		
	}

}
