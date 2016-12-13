package csquiz.selenium.playground;

import org.openqa.selenium.WebDriver;

import csquiz.selenium.browser.BrowserInterface;
import csquiz.selenium.browser.Firefox;
import csquiz.selenium.navigation.CsquizNavigation;
import csquiz.selenium.validation.ValidatePage;


public class AccessCsquiz16 {
	
	private WebDriver driver;
	
	public boolean runMe(){

		boolean result;
		
		BrowserInterface browser = new Firefox ();
		driver = browser.createBrowser();
		browser.setBrowserDefaults();
		//browser.maximizeBrowserWindow();
		
		
		result = browser.openUrl("http://csquiz.lnu.se:81/");
		if (result == false){
			System.out.print("\nERROR\tURL not found");
			browser.closeBrowser();
			return false;
		}
		
		CsquizNavigation navigator = new CsquizNavigation (driver);
		browser.delaySec(2000);
		
		
		// DO some validation
		
		ValidatePage pgValidator = new ValidatePage(driver);
		result = pgValidator.validateAssignmentText();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Assignment 2'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tValidation of Assignment 2");
		browser.delaySec(500);
		
		
		result = pgValidator.validateRegisterAnewUser();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Register a new User'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tValidation of Register a new User");
		browser.delaySec(500);

		result = pgValidator.validateNotLoggedIn();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Not logged in'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tValidation of Not logged in");
		browser.delaySec(500);
		
		result = pgValidator.validateLoginRequest();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Login - enter Username and password'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tLogin - enter Username and password");
		browser.delaySec(500);		

		
		//Locate Username and fill in wrong user
		result = navigator.setUsername ("XXXX");
		if (result == false){
			System.out.print("\nERROR\tFailed to set password");
			browser.closeBrowser();
			return false;
		}
		browser.delaySec(1000);
		
		//Locate Password and fill in  wrong password
		result = navigator.setPassword ("password001");
		if (result == false){
			System.out.print("\nERROR\tFailed to set password");
			browser.closeBrowser();
			return false;
		}
		browser.delaySec(1000);
		
		result = navigator.clickLogin();
		if (result == false){
			System.out.print("\nERROR\tFailed to click login");
			browser.closeBrowser();
			return false;
		}
		browser.delaySec(3000);
		
		
		
		
		result = pgValidator.validateNotLoggedIn();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Not Logged in'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tNot Logged in");
		browser.delaySec(500);		

		result = pgValidator.validateWrongNameOrPassword();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Wrong name or password'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tWrong name or password");
		browser.delaySec(500);		
		
		result = pgValidator.validateLoginRequest();
		if (result == false){
			System.out.print("\nERROR\tFailed to validate 'Login - enter Username and password'");
			browser.closeBrowser();
			return false;
		}
		else System.out.print("\nPASSED\tLogin - enter Username and password");
		browser.delaySec(2000);
		
		
		
		
		// close down the browser
		browser.closeBrowser();
		return true;
	}

}
