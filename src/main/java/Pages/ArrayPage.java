package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ArrayPage {

	// Locators or Object repositories

	private WebDriver driver;
	
	By GetStarted = By.xpath("//body/div[3]/div[2]/div/div/a");
	By ArrayInPython = By.xpath("//body/div[2]/ul[1]/a");
	By ChekArrayPage = By.xpath("//body/div[2]/div/div[2]/strong/p");
	By TryHereBtn = By.xpath("//body/div[2]/div/div[2]/a");
	By TryEditorTxtBox = By.xpath("//div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span");
	By runBtn = By.xpath("//*[@id=\"answer_form\"]/button");
	By ConsoleOutput = By.xpath("//*[@id=\"output\"]");
	By ArrayUsingListBtn = By.linkText("Arrays Using List");
	By BasicOperationsInListBtn = By.linkText("Basic Operations in Lists");
	By AppsOfArray = By.linkText("Applications of Array");

	private By ArraySections = By.cssSelector("div#content a");

	// constructor

	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		
	}

	// Page actions

	public int getArraySectionCount() {
		return driver.findElements(ArraySections).size();
	}

	public List<String> getArraySecList() {
		List<String> ArrayList = new ArrayList<String>();
		List<WebElement> ArraySecList = driver.findElements(ArraySections);

		for (WebElement e : ArraySecList) {
			String text = e.getText();
			System.out.println(text);
			ArrayList.add(text);
		}
		return ArrayList;
	}

	public void GetStartedBtn() {
		driver.findElement(GetStarted).click();
		;
	}

	public String ArrayPageTitle() {
		return driver.getTitle();
	}

	public void ArrayInPython() {
		driver.findElement(ArrayInPython).click();
	}
	

	public void ChkArrayInPythonPage() {

		if (driver.getCurrentUrl() == "https://dsportalapp.herokuapp.com/array/arrays-in-python/") {
			System.out.println("Arrays in Python Page is displayed");
		}	
	}
	public void TryHere() {
		System.out.println("I did in try here page....");
		driver.findElement(TryHereBtn).click();
	}
	public void TryEditorPage() {
		driver.getCurrentUrl();
		System.out.println("User is on the try editor page :"+ driver.getCurrentUrl());
	    System.out.println("Current Title of the page is:"+ driver.getTitle());
	}
	public void entrTextInTryEditorTxtBox() {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(TryEditorTxtBox);
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Wait.until(ExpectedConditions.visibilityOf(ele));
		
		String TextToInput = "print 'Hello'";
		action.sendKeys(ele, TextToInput).perform();
		System.out.println("I entered text box");
		
	}
	public void RunBtn() {
		driver.findElement(runBtn).click();
	}
	public void Consoleoutput() {
	String output =	driver.findElement(ConsoleOutput).getText();
	System.out.println(output);
	}
	public void ArrayUsingList() {
		driver.findElement(ArrayUsingListBtn).click();
	}
	
	public void ChkArrayUsingListsPage() {
		driver.getTitle();
		System.out.println("ArrayUsingList Page Title is:"+ driver.getTitle());
		
	}
	public void BsicOprtionInLst() {
		driver.findElement(BasicOperationsInListBtn).click();;
	}
	public void ChkBasicOperationListPage() {
		driver.getTitle();
		System.out.println("Basic Operation List Page Title is :"+ driver.getTitle());
		
	}
	public void AppsOfArray() {
		driver.findElement(AppsOfArray).click();
	}
	public void ChkApplicationOfArrayPage() {
		driver.getTitle();
		System.out.println("Application of Array Page Title is :"+ driver.getTitle());
		
	}

}
