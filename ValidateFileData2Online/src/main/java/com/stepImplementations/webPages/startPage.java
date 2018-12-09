package com.stepImplementations.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Jay.Yr
 *
 */
public class startPage {

	WebDriver webDriver	= null;
	
	//ID 
	@FindBy(how=How.LINK_TEXT,using="Start now")
	@CacheLookup
	WebElement startNow_button;
	
	/**
	 * 
	 * This method performs navigation from start page to next page by clicking a button
	 * 
	 * @param webDriver
	 */
	public startPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	/**
	 * Click to Navigate
	 */
	public void navigateToNextPage(){		
		startNow_button.click();
	}
	
}
