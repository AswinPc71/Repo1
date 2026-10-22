package testScript;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameHandling extends Base{

	public void frameHandle() {
		
		/* A frame(iframe) is an html element used to embed another webpage inside the current webpage.
		 * Selenium must switch to the frame before interacting with elements inside it. */
		
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement jMeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jMeter.click();
	}
	
	public static void main(String[] args) {
		
		FrameHandling frame = new FrameHandling();
		frame.browserInitialization();
		frame.frameHandle();

	}

}
