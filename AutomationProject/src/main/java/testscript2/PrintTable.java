package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class PrintTable extends Base {
	
	public void columnPrint() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for (WebElement temp:column) {
			System.out.println(temp.getText());
		}
	}
	public void check() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Senior Javascript Developer";
		List<WebElement> column= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for (WebElement temp:column) {
			
			if (temp.getText().equals(input)) {
				System.out.println(temp.getText());
				System.out.println("both are same");
			}
		}
	}
	public void rowPrint() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]"));
		System.out.println(row.getText());
	}
	public void printData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td[3]"));
		System.out.println(data.getText());
		
	}

	public static void main(String[] args) {
		PrintTable print=new PrintTable();
		print.initializebrowser();
		//print.columnPrint();
		//print.check();
		//print.rowPrint();
		print.printData();
		//print.driverQuitandClose();

	}

}
