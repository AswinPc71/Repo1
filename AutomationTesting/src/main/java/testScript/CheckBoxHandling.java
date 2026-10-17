package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxHandling extends Base{
	
	public void checkBox1() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		box1.click();
	}

	public void checkBoxIsEnabled() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(box1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else {
			System.out.println("Check box is not selected");
			box1.click();
		}
		
	}
	
	
	public static void main(String[] args) {
		CheckBoxHandling check = new CheckBoxHandling();
		check.browserInitialization();
		//check.checkBox1();
		check.checkBoxIsEnabled();

	}

}
