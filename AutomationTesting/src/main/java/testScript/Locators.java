package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void idLocatorSimpleFormDemo() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//SYNTAX -- WebElement element_name = driver.findElement(By.Locator("value"));
		
		WebElement input = driver.findElement(By.id("single-input-field"));
		input.sendKeys("Hellooo");
		
		WebElement showMessage = driver.findElement(By.id("button-one"));
		showMessage.click();
		
		WebElement enterValueA = driver.findElement(By.id("value-a"));
		enterValueA.sendKeys("56");
		
		WebElement enterElementB = driver.findElement(By.id("value-b"));
		enterElementB.sendKeys("87");
		
		WebElement getAPlusB = driver.findElement(By.id("button-two"));
		getAPlusB.click();
			
	}
	
	public void idLocatorCheckBoxDemo() {
        driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		
		WebElement check = driver.findElement(By.id("gridCheck"));
		check.click();
		
		WebElement checkBoxOne = driver.findElement(By.id("check-box-one"));
		checkBoxOne.click();
		
		WebElement checkBoxTwo = driver.findElement(By.id("check-box-two"));
		checkBoxTwo.click();
		
		
		WebElement checkBoxThree = driver.findElement(By.id("check-box-three"));
		checkBoxThree.click();
		
		
		WebElement unselectAll = driver.findElement(By.id("button-two"));
		unselectAll.click();
		
	}
	
	public void idLocatorRadioButtonDemo() {

		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement radioButtonDemoMale = driver.findElement(By.id("inlineRadio1"));
		radioButtonDemoMale.click();
		
		WebElement showSelectedValue = driver.findElement(By.id("button-one"));
		showSelectedValue.click();
		
		WebElement radioButtonDemoFemale = driver.findElement(By.id("inlineRadio2"));
		radioButtonDemoFemale.click();
		
		showSelectedValue.click();
		
		WebElement radioButtonPatientGenderMale = driver.findElement(By.id("inlineRadio11"));
		radioButtonPatientGenderMale.click();
		
		WebElement radioButtonPatientGenderFemale = driver.findElement(By.id("inlineRadio21"));
		radioButtonPatientGenderFemale.click();
		
		WebElement selectPatientAgeGroup1to18 = driver.findElement(By.id("inlineRadio22"));
		selectPatientAgeGroup1to18.click();
		
		WebElement selectPatientAgeGroup19to44 = driver.findElement(By.id("inlineRadio23"));
		selectPatientAgeGroup19to44.click();
		
		WebElement selectPatientAgeGroup45to60 = driver.findElement(By.id("inlineRadio24"));
		selectPatientAgeGroup45to60.click();
		
		WebElement getResultButton = driver.findElement(By.id("button-two"));
		getResultButton.click();
	}
	
	public void idLocatorFormSubmit() {
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		
		WebElement firstName = driver.findElement(By.id("validationCustom01"));
		firstName.sendKeys("aswin");
		firstName.clear();
		firstName.sendKeys("Lee");
		
		WebElement lastName = driver.findElement(By.id("validationCustom02"));
		lastName.sendKeys("Child");
		
		WebElement userName = driver.findElement(By.id("validationCustomUsername"));
		userName.sendKeys("LeeChild78");
		
		WebElement city = driver.findElement(By.id("validationCustom03"));
		city.sendKeys("San Diego");
		
		WebElement state = driver.findElement(By.id("validationCustom04"));
		state.sendKeys("California");
		
		WebElement zip = driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("California");
		
		WebElement agreeToTandC = driver.findElement(By.id("invalidCheck"));
		agreeToTandC.click();
			
	}
	
	public void idLocatorAjaxFormSubmit() {
		driver.navigate().to("https://selenium.qabible.in/ajax-form-submit.php");
		WebElement subject = driver.findElement(By.id("subject"));
		subject.sendKeys("Global Warming");
		
		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Global warming is the long-term rise in Earth’s average temperature, mainly caused by human activities that release greenhouse gases. Burning coal, oil, and gas, cutting down forests, and some farming practices add gases such as carbon dioxide and methane to the atmosphere. These gases trap heat, warming the planet and contributing to rising sea levels, melting ice, and more frequent or intense heat waves and other extreme weather.");
	}

	public void idLocatorSelectInput() {		
		WebElement selectColor = driver.findElement(By.id("single-input-field"));
		selectColor.click();
		
	}
	
	public void nameLocator() {
		
		WebElement date = driver.findElement(By.name("inlineRadioOptions"));
		
	}
	
	public void classNameLocator() {
		
		WebElement enterdate = driver.findElement(By.className("form-control datepicker"));
		WebElement button = driver.findElement(By.className("btn btn-primary"));
	}
	
	public void linkText() {
		WebElement bootstrapDatePicker = driver.findElement(By.linkText("Bootstrap Date Picker"));
		WebElement selectInput = driver.findElement(By.linkText("Select Input"));
		WebElement simpleDemo = driver.findElement(By.linkText("Simple Form Demo"));
	}
	
	public void partialLinkText() {
		WebElement bootstrapDate = driver.findElement(By.partialLinkText("Bootstrap Date"));
		WebElement select = driver.findElement(By.partialLinkText("Select"));
		WebElement simple = driver.findElement(By.partialLinkText("Simple Form"));
	}
	
	public static void main(String[] args) {
		
		Locators lct = new Locators();
		lct.browserInitialization();
		lct.idLocatorSimpleFormDemo();
		lct.nameLocator();
		lct.classNameLocator();
		lct.linkText();
		lct.partialLinkText();
		//lct.idLocatorCheckBoxDemo();
		//lct.idLocatorRadioButtonDemo();
		//lct.idLocatorFormSubmit();
		//lct.idLocatorAjaxFormSubmit();
		//lct.idLocatorSelectInput();

	}

}
