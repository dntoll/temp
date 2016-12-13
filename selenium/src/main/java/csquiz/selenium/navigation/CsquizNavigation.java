package csquiz.selenium.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CsquizNavigation extends Common {
	
	public CsquizNavigation (WebDriver myDriver){
		super (myDriver);
	}
	
	
	// .//*[@id='LoginView::UserName']
	public boolean setUsername (String myUsername){

		// Locate the element
		By xpathToElement = By.xpath(".//*[@id='LoginView::UserName']");
		
		WebElement currentElement = findElement(xpathToElement);
		
		if (currentElement != null){
			return enterElementValue (currentElement,myUsername);
		}
		
		// I should not be here
		return false;
		
	}
	
	// .//*[@id='LoginView::Password']
	public boolean setPassword (String myPassword){

		// Locate the element
		By xpathToElement = By.xpath(".//*[@id='LoginView::Password']");
		
		WebElement currentElement = findElement(xpathToElement);
		
		if (currentElement != null){
			return enterElementValue (currentElement,myPassword);
		}
		
		// I should not be here
		return false;
		
	}
	
	// html/body/div[1]/form/fieldset/input[4]     - login button
	public boolean clickLogin (){

		// Locate the element
		By xpathToElement = By.xpath("html/body/div[1]/form/fieldset/input[4]");
		
		WebElement currentElement = findElement(xpathToElement);
		
		if (currentElement != null){
			return clickElement (currentElement);
		}
		
		// I should not be here
		return false;
		
	}
	
	
	// html/body/div[1]/form/input
	public boolean clickLogout (){

		// Locate the element
		By xpathToElement = By.xpath("html/body/div[1]/form/input");
		
		WebElement currentElement = findElement(xpathToElement);
		
		if (currentElement != null){
			return clickElement (currentElement);
		}
		
		// I should not be here
		return false;
		
	}
	
}
