package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_Frame extends Base {
	@Test
	public void simpleAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement button1= driver.findElement(By.xpath("//button[@id='alertButton']"));
		button1.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void simpleAlertAfterDelay() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement button2= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		button2.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmationAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement button3= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		button3.click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	@Test
	public void promptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement button4= driver.findElement(By.xpath("//button[@id='promtButton']"));
		button4.click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	@Test
	public void frame() {
		
		driver.navigate().to("https://demoqa.com/nestedframes");
		WebElement parentframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(parentframe);
		WebElement childframe=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		WebElement textElement = driver.findElement(By.tagName("p"));
        System.out.println(textElement.getText());
       
	}
	
}
