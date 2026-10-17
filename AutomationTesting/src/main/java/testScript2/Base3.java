package testScript2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base3 {
	WebDriver driver;
	
	public void intialize() {
		driver = new EdgeDriver();
		driver.get("https://www.triumphmotorcycles.in/motorcycles/classic/bonneville/bonneville-t40");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.triumphmotorcycles.in/clothing-collection/casual");
		driver.navigate().refresh();
		driver.navigate().to("https://www.triumphmotorcycles.in/");
		

	}

	public static void main(String[] args) {
		Base3 bs3 = new Base3();
		bs3.intialize();
		
	

	}

}
