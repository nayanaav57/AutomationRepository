package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base{
	
	public void simpleAlert() {
		
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement button= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	button.click();
	String message= driver.switchTo().alert().getText();
	System.out.println(message);
	driver.switchTo().alert().accept();// since only 'ok' button use accept method
	}
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button1= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		button1.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();// for 'cancel' button
	}
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button2= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		button2.click();
		driver.switchTo().alert().sendKeys("hello");// to enter message in the text field
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert=new AlertHandling();
		alert.initializebrowser();
		//alert.simpleAlert();
		//alert.confirmationAlert();
		alert.promptAlert();
	}

}
