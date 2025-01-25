package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class CheckBoxSelect extends Base {
	
	public void select() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement value=driver.findElement(By.cssSelector("input#gridCheck"));
		//value.click();
		if(value.isSelected()) {
			System.out.println("checkbox already selected, unselect it");
			value.click();
		}
		else {
			System.out.println("checkbox not selected, select it");
			value.click();
		}
		
	}

	public static void main(String[] args) {
		CheckBoxSelect check= new CheckBoxSelect ();
		check.initializebrowser();
		check.select();
	}

}
