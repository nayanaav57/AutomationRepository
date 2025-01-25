package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScript extends Base{
	@Test
	public void javaScriptExecutor () {
		// inspect the input form and enter value in text field and click enter message button using java script
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;// for type casting
		WebElement id1=driver.findElement(By.id("single-input-field"));
		js.executeScript("arguments[0].value='hello';",id1);
		WebElement id2=driver.findElement(By.id("button-one"));
		js.executeScript("arguments[0].click();",id2);	
	}
	@Test
	public void javaScriptScroll () {
		// navigate to amazon page and scrolling of page
		driver.navigate().to("https://www.amazon.in/");	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,150)","");// scroll from up to down as per the given values
		//js.executeScript("window.scrollBy(0,1000)","");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");// automatically scroll to down of page by calculating its height

}
}
