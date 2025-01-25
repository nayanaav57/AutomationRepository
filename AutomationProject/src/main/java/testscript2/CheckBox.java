package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBox extends Base {
	
	public void selectCheckBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement value1=driver.findElement(By.cssSelector("input#gridCheck"));
		value1.click();
	}

	public static void main(String[] args) {
	
		CheckBox select=new CheckBox();
		select.initializebrowser();
		select.selectCheckBox();
	}

}
