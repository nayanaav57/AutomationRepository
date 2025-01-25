package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base {
	
	public void tablePrinting() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table= driver.findElement(By.xpath("//table[@id='dtBasicExample']"));// inspect inside the table
		System.out.println(table.getText());
	}
	
	public void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));// to print first row
		System.out.println(row.getText());
	}
	
	public void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[2]")); //to print second cell in first row
		System.out.println(cell.getText());	
	}
	public void columnPrinting() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement temp:column)// for each loop to iterate through list and print, temp is a variable
		{
			System.out.println(temp.getText());// to print data in the column stored as list in WebElement (column)
		}
	}
	
	public void checkData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Ashton Cox";// this value is present in first column
		List<WebElement> column= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	
		for(WebElement temp:column) {
		
		if (temp.getText().equals(input)) {
			System.out.println(temp.getText());
			System.out.println("both are same");
		}
		
	}
	
	}
	
	public static void main(String[] args) {
		TableHandling tabledata= new TableHandling();
		tabledata.initializebrowser();
		//tabledata.tablePrinting();
		tabledata.rowPrinting();
		//tabledata.cellPrinting();
		//tabledata.columnPrinting();
		//tabledata.checkData();

	}

}
