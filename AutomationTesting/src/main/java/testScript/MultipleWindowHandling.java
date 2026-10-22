package testScript;

import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandling extends Base{
	
	public void windowHandling() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		Actions action = new Actions(driver);
		action.click(contact).perform();
		WebElement login = driver.findElement(By.xpath("//h4[text()='Login Portal']"));
		action.click(login).perform();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("************************************");
		Set<String> allWindow = driver.getWindowHandles();
		for(String temp: allWindow) {
			System.out.println(temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println("******");
		}
	}

	public static void main(String[] args) {
		MultipleWindowHandling multiwin = new MultipleWindowHandling();
		multiwin.browserInitialization();
		multiwin.windowHandling();

	}

}


/*
  getWindowHandle() -- it retrives the current window handle
  getWindowHandles() -- it retrives the handles of all the opened windows
*/