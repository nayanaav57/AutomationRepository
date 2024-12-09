package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Elements extends Base{
	@Test
	public void textBox() {
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement name= driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Ram");
		WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("ram@gmail.com");
		WebElement currentaddress= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentaddress.sendKeys("Flat 6A,Sun Homes,Whitefeild,Banglaore");
		WebElement permanentaddress= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentaddress.sendKeys("TC 101/233,Ram Nivas,Trivandrum,Kerala");
		WebElement submitbutton= driver.findElement(By.xpath("//button[@id='submit']"));
		submitbutton.click();
	}
	@Test
	public void checkBox() {
		driver.navigate().to("https://demoqa.com/checkbox");
		WebElement check= driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		check.click();	
	}
	@Test
	public void radioButton() {
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement select= driver.findElement(By.xpath("//input[@id='yesRadio']"));
		select.click();	
	}
	@Test
	public void tableUpdate() {
		
		driver.navigate().to("https://demoqa.com/webtables");
		WebElement edit= driver.findElement(By.xpath("//span[@id='edit-record-2']"));
		edit.click();
		WebElement firstname= driver.findElement(By.xpath("//input[@id='firstName']"));
		//firstname.clear();
		firstname.sendKeys("Ganesh");
		//WebElement lastname= driver.findElement(By.xpath("//input[@id='lastName']"));
		//lastname.clear();
		//lastname.sendKeys("Murthy");
		//WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
		//email.clear();
		//email.sendKeys("ganesh@gmail.com");
		//WebElement age= driver.findElement(By.xpath("//input[@id='age']"));
		//age.clear();
		//age.sendKeys("35");
		WebElement submitbutton= driver.findElement(By.xpath("//button[@id='submit']"));
		submitbutton.click();
	}
	@Test
	public void button() {
		
		driver.navigate().to("https://demoqa.com/buttons");
		Actions action=new Actions(driver);
		WebElement doubleclick= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleclick).build().perform();
		WebElement rightclick= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightclick).build().perform();
		WebElement click= driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(click).build().perform();
		
	}
	@Test
	public void link() {
			driver.navigate().to("https://demoqa.com/links");
			WebElement link= driver.findElement(By.xpath("//a[@id='simpleLink']"));
			link.click();
	}
	@Test
	public void fileUploadAndDownload() {
			driver.navigate().to("https://demoqa.com/upload-download");	
			WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadFile']"));
			choosefile.sendKeys("C:\\Users\\nayan\\OneDrive\\Documents\\NAV\\resume1.docx");
			WebElement downloadbutton=driver.findElement(By.xpath("//a[@id='downloadButton']"));
			downloadbutton.click();
	}
	
}
