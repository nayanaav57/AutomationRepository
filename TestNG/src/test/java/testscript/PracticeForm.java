package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeForm extends Base {
	@Test
		public void fillForm() {
		
		    driver.navigate().to("https://demoqa.com/automation-practice-form");
			WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
			firstname.sendKeys("Fiba");
			WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
			lastname.sendKeys("Fathima");
			WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
			email.sendKeys("fibafathima@gmail.com");
			
			WebElement selectgender=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
			selectgender.click();
			
			WebElement mobnumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
			mobnumber.sendKeys("7854312120");
			WebElement dateofbirth=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
			dateofbirth.click();
			WebElement selectyear=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
			Select selectvalue1=new Select(selectyear);
			selectvalue1.selectByValue("2000");
			WebElement selectmonth=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
			Select selectvalue2=new Select(selectmonth);
			selectvalue2.selectByValue("5");
			WebElement selectdate=driver.findElement(By.xpath("//div[text()='12']"));
			selectdate.click();
			
			WebElement subject=driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
			subject.sendKeys("physics");
			
			WebElement selecthobbies=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
			selecthobbies.click();
			
			WebElement selectpicture=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
			selectpicture.sendKeys("C:\\Users\\nayan\\Downloads\\sampleFile.jpeg");
			WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
			address.sendKeys("TC 45/121,Manzil House,Delhi");
			//WebElement selectstate=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
			
			
			WebElement submitbutton=driver.findElement(By.xpath("//button[@id='submit']"));
			submitbutton.click();
			
	}
	
	
}

