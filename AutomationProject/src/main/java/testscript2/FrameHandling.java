package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class FrameHandling extends Base {
public void frame() {
	
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));//locate iframe
	driver.switchTo().frame(iframe);//switch to iframe
	WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));// locate the element to be clicked after switching to iframe
	image.click();
	
}
	
	public static void main(String[] args) {
		
		FrameHandling framehandle=new FrameHandling();
		framehandle.initializebrowser();
		framehandle.frame();
	}

}
