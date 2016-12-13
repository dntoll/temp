package csquiz.selenium.navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
	//TODO
	// Fix exceptions of object is not found
	// Fix wait for elements to be found/delays
	
	private WebDriver driver;
	
	public Common (WebDriver myDriver){
		driver = myDriver;
	}
	
	protected WebElement findElement (By locator){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	protected List <WebElement> findElements (By locator){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
				
	}
	
	protected boolean locateElement (By currentXpath){
				
	    WebElement currentElement = findElement (currentXpath);
	    if (currentElement == null) return false;

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",currentElement);
		
		return true;

	}
	
	protected boolean locateElement (WebElement currentElement){
				
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollTo(" +currentElement.getLocation().x +"," +(currentElement.getLocation().y) + ");");
		
		return true;
		
	}
	

	
	protected boolean clickElement (WebElement currentElement){
								
		WebElement element;
		
		element = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.visibilityOf(currentElement));
		
		element = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(currentElement));
								   
	    currentElement.click();


		return true;
		
	}
	
	protected boolean enterElementValue (WebElement currentElement, String text){
		
		WebElement element = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.elementToBeClickable(currentElement));
		
		element = (new WebDriverWait(driver, 10))
				   .until(ExpectedConditions.visibilityOf(currentElement));
				   
		currentElement.clear();
		currentElement.sendKeys(text);

		return true;
		
	}

}
