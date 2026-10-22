package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base{
	
	public void dragAndDrop() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement n4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		//Syntax for Action class object - Actions objname = new Actions(Webdriver reference variable);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(n4, drop).perform();
		
	}
	
	public void rightClick() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement n4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action = new Actions(driver);
		action.contextClick(n4).perform();
		
	}
	
	public void mouseOver() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement n4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action = new Actions(driver);
		action.moveToElement(n4).perform();
	
	}
	
	public void clickMethod() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement n4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action = new Actions(driver);
		action.click(n4).perform();
	}
	
    public void doubleClickMethod() {
    	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement n4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action = new Actions(driver);
		action.doubleClick(n4).perform();
	}

	public static void main(String[] args) {
		ActionClass act = new ActionClass();
	    act.browserInitialization();
	    //act.dragAndDrop();
	    //act.rightClick();
	   // act.mouseOver();
	    act.doubleClickMethod();
	    //act.clickMethod();

	}

}
