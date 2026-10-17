package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{
	
	public void tagAndId() {
		WebElement tagAndId1 = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagAndId2 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement checkBox2 = driver.findElement(By.cssSelector("input#check-box-two"));
		WebElement inputBox1 = driver.findElement(By.cssSelector("input#validationCustom01"));
		WebElement descriptionBox = driver.findElement(By.cssSelector("textarea#description")); 
		
	}
	
	public void tagAndClass() {
		WebElement tagAndClass1 = driver.findElement(By.cssSelector("input.form-control.datepicker"));
		WebElement subject = driver.findElement(By.cssSelector("input.form-control"));
		WebElement singleCheckboxDemo = driver.findElement(By.cssSelector("input.form-check-input"));
		WebElement submitForm = driver.findElement(By.cssSelector("button.btn.btn-primary"));
		WebElement submitAjaxForm = driver.findElement(By.cssSelector("input.btn.btn-primary"));
				
	}
	
	public void tagAndAttribute() {
		WebElement tagAndAttribute1 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement getFirstSelected = driver.findElement(By.cssSelector("button[id='button-first']"));
		WebElement checkBoxThree = driver.findElement(By.cssSelector("input[id='check-box-three']"));
		WebElement radio45to60 = driver.findElement(By.cssSelector("input[id='inlineRadio24']"));
		WebElement showButton = driver.findElement(By.cssSelector("button[id='button-one']"));
					
	}
	
	public void tagClassAndAttribute() {
		
		WebElement tagClassAndAttribute1 = driver.findElement(By.cssSelector("input.form-control.datepicker[id='single-input-field']"));
		WebElement enterDate = driver.findElement(By.cssSelector("input.form-control[id='single-input-field2']"));
		WebElement state = driver.findElement(By.cssSelector("input.form-control[id=\"validationCustom04\"]"));
		WebElement agree = driver.findElement(By.cssSelector("input.form-check-input[id='invalidCheck']"));
		WebElement showDate = driver.findElement(By.cssSelector("button.btn.btn-primary[id='button-two']"));
	}

	
	public static void main(String[] args) {
		

	}

}


/*
 1. Tag and ID(tag#id)
2. Tag and Class(tag.class)
3. Tag and Attribute(tag[attribute='value'])
4. tag,class and attribute(tag.class[attribute='value'])*/