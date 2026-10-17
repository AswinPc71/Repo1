package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath  extends Base{
	
	public void relativeXpath() {
		//syntax - //tagname[@attribute = 'value'];
		
		WebElement relXpath = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement reXpath1 = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	}
	
	public void text() {
		//Syntax- //tagname[text()='value'];
		
		WebElement textmeth = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement grtTotal = driver.findElement(By.xpath("//button[text() = 'Get Total']"));
		WebElement formSubmit = driver.findElement(By.xpath("//button[text()='Submit form']"));
	}
	
	public void contains() {
		//syntax - //tagname[contains(@attribute,'value')]; 
		//syntax - //tagname[contains(text(),'value']
		
		//attribute
		WebElement enterMsg = driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));
		WebElement enterValueA = driver.findElement(By.xpath("//input[contains(@id,'ue-b')]"));
		
		//text 
		WebElement twoValue = driver.findElement(By.xpath("//div[contains(text(),'wo Input Fields')]"));
		WebElement singleVal = driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));
		
	}
	
	public void startsWith() {
		//syntax - //tagname[starts-with(@attribute,'value')]; 
		//syntax - //tagname[starts-with(text(),'value']
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*absolute X-path
 * 1 starts from the root node(Html)
 * 2 Shows the complete path from the begining to the element
 * 3 Begins with single slash \
 * eg :/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button/
 * 
 * Disadvantages 
 * 1 very long
 * 2 Break easily if the page structure changes.
 * 
 * 
 * Relative X-path
 * 1 Starts from anywhere in the dome
 * 2 Begins with double slash
 * 3 more flexible and it is commonly used in selenium
 * 
 *  Advantages :
 *  1 short
 *  2 stable
 *  3 mostly used in automation
 */