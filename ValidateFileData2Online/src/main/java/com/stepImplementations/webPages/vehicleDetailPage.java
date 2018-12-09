/**
 * 
 */
package com.stepImplementations.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.stepImplementations.Beans.vehicleDetailBean;

/**
 * @author Jay.YR
 *
 */
public class vehicleDetailPage {

	WebDriver webDriver	= null;
	vehicleDetailBean vehicleDetails = null;

	@FindBy(how=How.XPATH,using=".//*[@id='pr3']/div/ul/li[1]/span[2]")
	@CacheLookup
	WebElement vehicleRegPlate;

	@FindBy(how=How.XPATH,using=".//*[@id='pr3']/div/ul/li[2]/span[2]/strong")
	@CacheLookup
	WebElement vehicleMake;

	@FindBy(how=How.XPATH,using=".//*[@id='pr3']/div/ul/li[3]/span[2]/strong")
	@CacheLookup
	WebElement vehicleColor;

	@FindBy(how=How.ID,using="Correct_False")
	@CacheLookup
	WebElement radioButton_SearchAgain;

	@FindBy(how=How.NAME,using="Continue")
	@CacheLookup
	WebElement continue_Button;
	
	/**
	 * @param webDriver
	 */
	public vehicleDetailPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public vehicleDetailBean getVehicleDetails(){
		
		vehicleDetails = new vehicleDetailBean();
		vehicleDetails.setRegistrationNumber(vehicleRegPlate.getText());
		vehicleDetails.setVehicleMake(vehicleMake.getText());
		vehicleDetails.setVehicleModel(vehicleColor.getText());
		
		//Irrespective of Vehicle detail, Select to Search Again
		radioButton_SearchAgain.click();
		//Now Navigate to RegPlate entry Page
		continue_Button.click();
		
		return vehicleDetails;
	}

}
