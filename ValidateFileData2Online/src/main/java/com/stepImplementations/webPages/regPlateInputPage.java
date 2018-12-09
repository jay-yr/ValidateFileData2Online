/**
 * 
 */
package com.stepImplementations.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Dillu
 *
 */
public class regPlateInputPage {

	WebDriver webDriver	= null;
	
	//Enter the registration number of the vehicle - Input Field
	@FindBy(how=How.ID,using="Vrm")
	@CacheLookup
	WebElement regPlate_input;
	
	//Enter the registration number of the vehicle - Continue Button
	@FindBy(how=How.NAME,using="Continue")
	@CacheLookup
	WebElement continue_button;

	/**
	 * @param webDriver
	 */
	public regPlateInputPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	/**
	 * 
	 * This method keys in Input and navigates to next page
	 * 
	 * @param vehicleRegPlate
	 */
	public void keyinRegPlateandNavigate(String vehicleRegPlate){
		
		//Key in the Vehicle Registration Plate
		regPlate_input.sendKeys(vehicleRegPlate);
		//Click on the Continue button
		continue_button.click();
		
	}
	
}
