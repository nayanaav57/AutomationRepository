package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	
	//syntax of basicXpath: //tag[@attribute='value']
	 //in the above syntax, '//': to select current node and '@' : to select attribute
	
	public void basicXpath() {
		
		WebElement basic1= driver.findElement(By.xpath("//button[@id='button-one']"));	
		WebElement basic2=driver.findElement(By.xpath("//input[@id='value-a']"));	
		WebElement basic3=driver.findElement(By.xpath("//input[@id='value-b']"));	
	}
	
	public void contains() {
		
		// syntax of contains: //tag [contains(@attribute,'value')]
		WebElement contain1= driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement contain2= driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		WebElement contain3= driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		
	}
	
	public void startsWith() {
		
		//syntax of startsWith() : //tag[starts-with(@attribute,'value')]
		
		WebElement startwith1= driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement startwith2= driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement startwith3= driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
	}
	
	public void text() {
		
		//syntax of text(): //tag[text()='text']
		
		WebElement text1= driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text2= driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text3= driver.findElement(By.xpath("//div[text()='Your Message : ']"));
	}
	
	public void or() {
		// or syntax: //tag[@attribute='value' or @attribute='value']
		WebElement orvalue1= driver.findElement(By.xpath("//input[@id ='single-input-field' or @placeholder='Message']"));
		//WebElement orvalue2= driver.findElement(By.xpath("//div[@class='collapse navbar-collapse' or @ id='collapsible Navbar']"));
	}
	public void and() {
		// and syntax: //tag[@attribute='value' and @attribute='value']
		
		WebElement andvalue1= driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));
		WebElement andvalue2= driver.findElement(By.xpath("//input[@id='value-b' and @class='form-control']"));
		WebElement andvalue3= driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		
	}
}
