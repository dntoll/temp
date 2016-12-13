package csquiz.selenium.browser;

import org.openqa.selenium.WebDriver;

public interface BrowserInterface {
	
	public WebDriver createBrowser ();
	public void closeBrowser();
	public void setBrowserDefaults();
	public void maximizeBrowserWindow();
	public boolean openUrl (String url);
	public void browserClickBack();
	public void browserClickForward();
	public WebDriver getDriverInstance ();
	public void delaySec(long delay);

}
