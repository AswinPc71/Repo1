package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMe.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickMe2.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		//alert.accept();
	}
	
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickForPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickForPrompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Aswin");
		alert.accept();
	}
	
	public static void main(String[] args) {
		AlertHandling alerthandl = new AlertHandling();
		alerthandl.browserInitialization();
		//alerthandl.simpleAlert();
		//alerthandl.confirmationAlert();
		alerthandl.promptAlert();

	}

}


/*
 * Selenium provides 'Alert' interface to handle the alerts 
 * */
 