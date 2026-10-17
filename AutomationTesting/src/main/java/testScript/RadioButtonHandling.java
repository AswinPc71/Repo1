package testScript;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonHandling extends Base {
	
	public void radioButtons() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radio1.click();
		
	}
	
	public void radioButtons2() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		if(radio1.isSelected()) {
			System.out.println("Radio button is selected");
		}
		else {
			System.out.println("Radion button is not selected");
			radio1.click();
		}
		
	}
	
	public void radioButtons3() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		if(radio1.isEnabled()) {
			System.out.println("Radio button is Enabled");
		}
		else {
			radio1.click();
		}
		
	}
	
	public void radioButtons4() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		if(radio1.isDisplayed()){
			System.out.println("Radio button is Displayed");
		}
		else {
			radio1.click();
		}
		
	}

	public static void main(String[] args) {
		
		RadioButtonHandling radioButton = new RadioButtonHandling();
		radioButton.browserInitialization();
		radioButton.radioButtons();
		radioButton.radioButtons2();
		radioButton.radioButtons3();
		radioButton.radioButtons4();
		
		

	}

}


/*
 * isSelected() -- Used to verify if the radio button is selected.
 * 
 * isEnabled() -- Used to verify if the radio button is enabled.
 * 
 * isDisplayed() -- Used to check if the radio button is visible.
 
  */
