package testScript2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base2 {
	
	WebDriver driver;
	
	public void browserIntialization() {
		driver = new ChromeDriver();
		driver.get("https://ababelperfumes.com/?srsltid=AU7gw4WxW2jjkc98VnhjYRHhDvGG30znLT8AgLx3A-c7dnNEfNULFIoR");
		driver.manage().window().maximize();
	}
	
	public void browserClose() {
		driver.close();
	}
	
	
	public static void main(String[] args) {
		Base2 base = new Base2();
		base.browserIntialization();
		//base.browserClose();

	}

}
