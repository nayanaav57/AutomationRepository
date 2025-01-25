package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class RadioButton extends Base {
	
	public void radioButtonHandling() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement value1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		value1.click();
		WebElement value2=driver.findElement(By.cssSelector("button#button-one"));
		value2.click();
	}
	public static void main(String[] args) {
		
		RadioButton buttonhandling =new RadioButton();
		buttonhandling.initializebrowser();
		buttonhandling.radioButtonHandling();
		//buttonhandling.driverQuitandClose();
		
		
	}
}
