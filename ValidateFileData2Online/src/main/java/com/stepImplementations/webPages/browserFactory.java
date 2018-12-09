package com.stepImplementations.webPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * 
 * @author Jay.YR
 * 
 * Generic Browser factory class that returns a WebDriver of desired type
 *
 */
public class browserFactory {

	 static WebDriver webDriver;
	
	/**
	 * 
	 * @param 	Browsertype (Firefox | Chrome | internetExplorere)
	 * @param 	url of interest to navigate to
	 * @return	WedDriver
	 */
	public static WebDriver startBrowser(String browserName, String url){
		
		if (browserName.equalsIgnoreCase("firefox")) {
			webDriver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
			webDriver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("explorer")) {
			webDriver = new InternetExplorerDriver();
		}
		
		webDriver.manage().window().maximize();
		webDriver.get(url);
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return webDriver;
	}
	
	public static void closeBrowser(){
		webDriver.quit();
	}
	
}
