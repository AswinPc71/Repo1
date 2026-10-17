package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends Base{
	
	public void visibleText() {
		// syntax select object = new select(webElement name)
		
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select obj = new Select(dropdown1);
		obj.selectByVisibleText("Red");	
	}

	public void index() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select obj = new Select(dropdown1);
		obj.selectByIndex(2);
	}
	
	public void value() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select obj = new Select(dropdown1);
		obj.selectByValue("Green");
	}
	
	public static void main(String[] args) {
		DropdownHandling drop = new DropdownHandling();
		drop.browserInitialization();
	//	drop.visibleText();
	//	drop.index();
		drop.value();

	}

}


/*
 * Drop downs are of two types 
 * 
 * 1. Standard Drop downs -- Select tag is used to create a standard Dropdown.
 *                           Selenium provides select class to handle the drop downs.
 * 
 * 2. Custom Drop downs -- Select tag is not used
 * 
 * 
 * 	Select class provides three methods to select a value from the drop down
		1.selectByVisibleText()
		2. selectByValue()
		3.selectByIndex()
 * 
 * */
 