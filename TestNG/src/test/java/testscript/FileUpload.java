package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base{
	@Test
	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement choose=driver.findElement(By.xpath("//input[@id='file-upload']"));
		choose.sendKeys("C:\\Users\\nayan\\OneDrive\\Documents\\NAV\\resume1.docx");//give path of file to upload
		
	    WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
	    upload.click();
	}
	
	@Test
	public void fileUploadUsingRobotClass() throws AWTException {
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectfile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectfile.click();
		StringSelection select=new StringSelection("C:\\Users\\nayan\\OneDrive\\Documents\\NAV\\1.pdf");// file path is given to variable 'select' 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);// file path in variable 'select'  will be copied to Clipboard
		Robot a=new Robot();// creating object for Robot class (Robot class used for keyboard events)
		a.delay(2500);// to give a delay between copy and paste as execution is fast
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_V);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_V);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
	}
}
