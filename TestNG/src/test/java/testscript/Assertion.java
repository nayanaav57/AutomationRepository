package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	
@Test
	public void assertEquals() {
		
		driver.navigate().to("https://www.browserstack.com/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualtitle, expectedtitle);// Assert is a class used for assertion,assertEquals - test case pass if titles are same
	}
@Test
public void assertNotEquals() {
	driver.navigate().to("https://www.browserstack.com/");
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String expectedtitle="most Reliable App & Cross Browser Testing Platform | BrowserStack";
	Assert.assertNotEquals(actualtitle, expectedtitle);//assertNotEquals - test case pass if titles are not same
}
@Test

public void assertTrue() {
	driver.navigate().to("https://www.browserstack.com/");
	boolean verifytitle=driver.getTitle().equalsIgnoreCase("most Reliable App & Cross Browser Testing Platform | BrowserStack");
	Assert.assertTrue(verifytitle);// if boolean variable true test case pass
}
@Test
public void assertFalse() {
	driver.navigate().to("https://www.browserstack.com/");
	boolean verifytitle=driver.getTitle().equalsIgnoreCase("hello most Reliable App & Cross Browser Testing Platform | BrowserStack");
	Assert.assertFalse(verifytitle);// if boolean variable false test case pass
}
}

