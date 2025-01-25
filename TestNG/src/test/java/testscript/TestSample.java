package testscript;

import org.testng.annotations.Test;

public class TestSample extends Base {
	@Test(priority=3)
	public void show() {
		
		System.out.println("show");	}
	@Test(priority=1)
public void display() {
		
		System.out.println("display");	}
	@Test(priority=2)
public void print() {
	
	System.out.println("print");	}
	
}
