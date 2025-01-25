package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSS_Selectors extends Base{
	//1.Tag and ID(tag#id)
	//2.Tag and class(tag.class)
	//3.Tag and Attribute(tag[attribute=value]
	//4.Tag,class,and Attribute(tag.classname[attribute=value]
	
	public void tagId() {
		
		WebElement tagid1=driver.findElement(By.cssSelector("button#button-one"));
		WebElement tagid2=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagid3=driver.findElement(By.cssSelector("div#message-one"));	
	}
	
	
	public void tagClass() {
		WebElement tagclass1=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement tagclass2=driver.findElement(By.cssSelector("footer.mt-5"));
		WebElement tagclass3=driver.findElement(By.cssSelector("div.mb-sec"));
	}
	public void tagAttribute() {
		WebElement tagattribute1=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement tagattribute2=driver.findElement(By.cssSelector("div[id='message-one']"));
		WebElement tagattribute3=driver.findElement(By.cssSelector("input[id='value-a']"));
	}
		
	public void tagClassAttribute(){
		WebElement tagclassattribute1=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement tagclassattribute2=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));
		WebElement tagclassattribute3=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	}
}

