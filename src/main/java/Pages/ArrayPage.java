package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ReadExcelDataRows;


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
	By PracticeQues = By.linkText("Practice Questions");
	By SearchArry = By.linkText("Search the array");
	By SubmitBtn = By.xpath("//*[@type='submit']");
	By ErrorMessage = By.xpath("//pre[@id='output']");
	By MaxConseOnes = By.linkText("Max Consecutive Ones");
	By EvnNumOfDigits = By.linkText("Find Numbers with Even Number of Digits");
	By SquaresOfSortedArray = By.linkText("Squares of a Sorted Array");
	

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
				driver.findElement(TryHereBtn).click();
	}
	public void TryEditorPage() {
		driver.getCurrentUrl();
		System.out.println("User is on the try editor page :"+ driver.getCurrentUrl());
	    System.out.println("Current Title of the page is:"+ driver.getTitle());
	}
	
//	public static void TextIndentation(WebDriver driver, WebElement pythonElement, int row, int space,boolean flag) {
//		 Actions action = new Actions(driver);
//	        //Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
//		for(int i=1;i<=row;i++) {
//		      action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
//		       for(int j=1;j<=space;j++) {
//	            if(i==1 && flag) action.sendKeys(Keys.BACK_SPACE).perform();
//	            else action.sendKeys(Keys.DELETE).perform();
//			   }
//		}
//	}
	
	public void entrTextInTryEditorTxtBox() {
		Actions action = new Actions(driver);
		for(int i=1; i<=50; i++)	{
			
		 action.sendKeys(Keys.DELETE).perform();
	
		}
		WebElement ele = driver.findElement(TryEditorTxtBox);
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Wait.until(ExpectedConditions.visibilityOf(ele));
		//String TextToInput = "print 'Hello'";
		String TextToInput = ReadExcelDataRows.ReadRows().get(2).toString();
		System.out.println("I read it from Excel: "+TextToInput);
		action.sendKeys(ele, TextToInput).perform();

		
	}
	public void RunBtn() {
		driver.findElement(runBtn).click();
	}
	public void Consoleoutput() {
	String output =	driver.findElement(ConsoleOutput).getText();
	System.out.println("Console Output: "+ output);
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
	public void PracticeQuesLink() {
		driver.findElement(PracticeQues).click();
	}
	public void SearchArray() {
		driver.findElement(SearchArry).click();
	}
	public void SubmitBtn() {
		driver.findElement(SubmitBtn).click();
	}
	public void ErrorMsg() {
		String Msg = driver.findElement(ErrorMessage).getText();
		System.out.println("Error Message: "+ Msg);
	}
	public void MaxConsOnes() {
		driver.findElement(MaxConseOnes).click();
	}
	public void EvenNoOfDigits() {
		driver.findElement(EvnNumOfDigits).click();
	}
	public void SquaresOfSortedArray() {
		driver.findElement(SquaresOfSortedArray).click();
	}
	public void PageRefresh() {
		driver.navigate().refresh();
	}
	

}