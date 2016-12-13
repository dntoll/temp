package csquiz.selenium.browser;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox implements BrowserInterface{
	
	// TODO
	// Fix an ENUM for different browser types
	// Fix paths etc. for the needed driver Firefox, Edge etc.
	// Fix some kind of assertion mechanism
	// Improve the Exception handling
	
	
	private WebDriver driver;
	
	final private String DRIVERPATH = "c:\\work\\selenium\\";
	
	public Firefox (){
		
	}
		
	public WebDriver createBrowser (){
		
		LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log","org.apache.commons.logging.impl.NoOpLog");
		java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
		java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF); 
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF); 

		java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF); 

		System.setProperty("webdriver.gecko.driver", DRIVERPATH+"geckodriver.exe");
		driver = new FirefoxDriver();

		return driver;
		
	}
	
	public void closeBrowser(){
		
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		
	}
	
	public void setBrowserDefaults(){
		
		// default timeouts or some other things
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);		
		
	}
	
	public void maximizeBrowserWindow(){
		
		driver.manage().window().maximize();
		
	}
	
	public boolean openUrl (String url){
		
		driver.navigate().to(url);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.urlToBe(url));

	}
	
	public void browserClickBack(){
		driver.navigate().back();
	}

    public void browserClickForward(){
		driver.navigate().forward();
	}
    
    public WebDriver getDriverInstance (){
    	return driver;
    }
    
    public void delaySec(long delay){
    	
    	try {
    		Thread.sleep(delay);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    

	
}




