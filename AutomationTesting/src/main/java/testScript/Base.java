package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Base {
	
	WebDriver driver;
	
	public void browserInitialization() {
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void browserQuitAndClose() {
		//driver.quit();
		//driver.close();
	}

	public static void main(String[] args) {
		
		Base base = new Base();
		base.browserInitialization();
		base.browserQuitAndClose();
		

	}

}
