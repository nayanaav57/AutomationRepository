package testscript2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class SelectRadioButton extends Base {
	
	public void checkIfSelected() {
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement value1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		//value1.click();
		if (value1.isSelected()) {
			System.out.println("radio button already selected");
			
		}
		else {
			value1.click();
			
			System.out.println("radio button is selected");
		}
		WebElement value2=driver.findElement(By.cssSelector("button#button-one"));
		value2.click();
	}

	public static void main(String[] args) {
		
		SelectRadioButton select=new SelectRadioButton();
		select.initializebrowser();
		select.checkIfSelected();

	}

}
