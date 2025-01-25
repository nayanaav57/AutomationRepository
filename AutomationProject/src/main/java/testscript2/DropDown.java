package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript.Base;

public class DropDown extends Base {
public void visibleText() {
	
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement text=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select selecttext=new Select(text);
	selecttext.selectByVisibleText("Red");
	
}
public void index() {
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement index=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select selectindex=new Select(index);
	selectindex.selectByIndex(2);
}
public void value() {
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement value=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select selectvalue=new Select(value);
	selectvalue.selectByValue("Green");
	
}
	public static void main(String[] args) {
		DropDown dropdown=new DropDown();
		dropdown.initializebrowser();
		//dropdown.visibleText();
		//dropdown.index();
		dropdown.value();

	}

}
