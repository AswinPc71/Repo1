package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class tableHandling extends Base{
	
	public void table() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table1.getText());
	}
	
	public void row() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(table1.getText());
	}

	public void cell() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		System.out.println(table1.getText());
	}
	
	public void tableColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		
		for(WebElement col: table1) {
			System.out.println(col.getText());
		}
		
	}
	
	public static void main(String[] args) {
		tableHandling tbl = new tableHandling();
		tbl.browserInitialization();
		//tbl.table();
		//tbl.row();
		//tbl.cell();
		tbl.tableColumn();
 
	}

}
