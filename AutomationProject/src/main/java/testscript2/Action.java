package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class Action extends Base{
	
	public void dragAction() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropbox=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		//action.moveToElement(dropbox).build().perform();// perform mouse hovering
		//action.doubleClick(dropbox).build().perform();
		//action.contextClick(drag).build().perform();
		action.dragAndDrop(drag, dropbox).build().perform();//move to location it has to be dropped
	}
	
	

	public static void main(String[] args) {
		
		Action actionclass=new Action();
		actionclass.initializebrowser();
		actionclass.dragAction();

	}

}
