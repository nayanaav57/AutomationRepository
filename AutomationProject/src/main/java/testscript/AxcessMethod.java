package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxcessMethod extends Base{
	
	public void parent() {
		
		WebElement locateparent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));//to locate parent using child		
	}
	
	public void child() {
		
		WebElement locatechild=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));//to locate child using parent
	}
	
	public void followingSibling() {
		
		WebElement followingsibling=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
	}
	
	public void following() {
		
		WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
	}
	
	public void preceding() {
		
		WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
	}
	
	public void ancestor() {
		
		WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
	}
	
	public void descendant() {
		
		WebElement descendant=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::li"));
				
	}
	
	public void indexing() {
		
	  WebElement indexing=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[1]"));	
	}
}
