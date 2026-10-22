package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Root {
	WebDriver driver;
	
	
	public void browserStartup() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
	}
	
	public void navigation() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
	
	public void browser() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String source = driver.getPageSource();
		System.out.println(source);
	}
	
	public void locator() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement enterMsg1 = driver.findElement(By.id("single-input-field"));
		enterMsg1.sendKeys("Hello");
		
		WebElement showmessage1 = driver.findElement(By.id("button-one"));
		showmessage1.click();
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement check1 = driver.findElement(By.className("form-check-input"));
		check1.click();
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1 = driver.findElement(By.name("inlineRadioOptions"));
		
	    WebElement simple = driver.findElement(By.linkText("Simple Form Demo"));
	    simple.click();
	    
	    WebElement checkbox = driver.findElement(By.partialLinkText("Checkbox"));
	    checkbox.click();
	    
	    WebElement check2 = driver.findElement(By.cssSelector("input#check-box-two"));
	    check2.click();
	    
	    WebElement check3 = driver.findElement(By.cssSelector("input.form-check-input"));
	    check3.click();
	    
	    WebElement select = driver.findElement(By.cssSelector("input[id='button-two']"));
	    select.click();
	    
	    WebElement deselect = driver.findElement(By.cssSelector("input.btn.btn-primary[id='button-two']"));
	    deselect.click();
	    
	    driver.navigate().to("https://selenium.qabible.in/form-submit.php");
	    WebElement form1 = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
	    form1.sendKeys("Abcada");
	    
	    WebElement formsubmit = driver.findElement(By.xpath("//button[text()='Submit form']"));
	    formsubmit.click();
	    
	    WebElement lstName = driver.findElement(By.xpath("//input[contains(@id,'validationCustom02')]"));
	    lstName.sendKeys("hkjhjkhh");
	    
	    driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	    
	    WebElement getTotal = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
	    getTotal.click();
		
	}
	
	public void dragandDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}

	
	public void rightClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(drag).perform();
	}
	
	public void table() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tbl = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tbl.getText());
	}
	
	
	public static void main(String[] args) {
		Root root = new Root();
		root.browserStartup();
		//root.navigation();
		//root.browser();
		//root.locator();
		//root.dragandDrop();
		//root.rightClick();
		root.table();

	}

}
