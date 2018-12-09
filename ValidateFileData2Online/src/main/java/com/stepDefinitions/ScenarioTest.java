/**
 * 
 */
package com.stepDefinitions;

import gherkin.formatter.model.Scenario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import junit.framework.AssertionFailedError;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.stepImplementations.Beans.fileDetailBean;
import com.stepImplementations.Beans.vehicleDetailBean;
import com.stepImplementations.fileUtil.fileReaderImpl;
import com.stepImplementations.webPages.browserFactory;
import com.stepImplementations.webPages.regPlateInputPage;
import com.stepImplementations.webPages.startPage;
import com.stepImplementations.webPages.vehicleDetailPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Jay.YR
 *
 */
public class ScenarioTest {

	private FileHandler 			fileHandler 		= 	null;
	private SimpleFormatter 		formatter 			=	null;
	private static Logger 			logger				=	null;
	private fileReaderImpl 			fileReadHelper  	= 	null;
	private WebDriver 				webDriver 			=	null;
	private File[] 					fileList			=	null;
	private List<fileDetailBean>	fileDetailInfoList 	= 	new ArrayList<fileDetailBean>();
	
	
	/**
	 * 
	 * @throws SecurityException
	 * @throws IOException
	 */
	@Before("@DefaultScenario")
	public void setUp() throws SecurityException, IOException{
		logger = Logger.getLogger(ScenarioTest.class.getName());
		fileHandler	= new FileHandler("./ScenarioImpl.log");
		formatter = new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		fileHandler.setLevel(Level.ALL);
		logger.addHandler(fileHandler);		
	}
	
	@Given("^I want to traverse a folder \"([^\"]*)\" for files$")
	public void i_want_to_traverse_a_folder_for_files(String directory) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		try {
			
			logger.info("Start of Directory Traversal: " + directory);
			fileReadHelper = new fileReaderImpl(directory);
			fileList = fileReadHelper.traverseDirectory();
			logger.info(fileList.length + " files found");
			
		} catch (Exception excep) {
			logger.log(Level.SEVERE, excep.getMessage(), excep);
		}
	}

	@When("^files of supported fileformats \"([^\"]*)\" are available$")
	public void files_of_supported_fileformats_are_available(String mimeTypes) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		try {
			
			fileDetailBean fileDetail = null;
			logger.info("Start of filtering the file list");
			for(File singleFile : fileList){
				fileDetail = fileReadHelper.getFileDetail(singleFile);
				Assert.assertTrue(mimeTypes.contains(fileDetail.getFileExtension().toUpperCase()));
				fileDetailInfoList.add(fileDetail);
			}
		
		} catch (Exception excep) {
			logger.log(Level.SEVERE, excep.getMessage(), excep);
		}
	}

	@Then("^read files one by one for Vehicle Details$")
	public void read_files_one_by_one_for_Vehicle_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		try {
			for(fileDetailBean fileDetail : fileDetailInfoList){
				logger.info("Reading Vehicle Info from the File: "+fileDetail.getFileName());
				fileDetail.setVehicleDetails(fileReadHelper.getVehicelDetailsfromfile(fileDetail.getFile(), fileDetail));
				logger.info(fileDetail.getVehicleDetails().size()+" Vehicle details read from file");
			}
			
		} catch (Exception excep) {
			logger.log(Level.SEVERE, excep.getMessage(), excep);
		}	
	}

	@Then("^open url \"([^\"]*)\" in firefox browser$")
	public void open_url_in_firefox_browser(String uri) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		try {

			webDriver = browserFactory.startBrowser("Firefox", uri);
			startPage newStartPage	=	PageFactory.initElements(webDriver, startPage.class);
			newStartPage.navigateToNextPage();
			
		} catch (Exception excep) {
			// TODO: handle exception
			logger.log(Level.SEVERE, excep.getMessage(), excep);
		}
		
	}

	@Then("^key in Vehicle regno and verify detail$")
	public void key_in_Vehicle_regno_and_verify_detail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		try {
			
			for(fileDetailBean fileDetail : fileDetailInfoList){
				for(vehicleDetailBean vehicleDetail : fileDetail.getVehicleDetails()){
					logger.log(Level.INFO, "look for Vehicle Registration: "+vehicleDetail.getRegistrationNumber());
					regPlateInputPage newRegPlateInPage    = PageFactory.initElements(webDriver, regPlateInputPage.class);
					newRegPlateInPage.keyinRegPlateandNavigate(vehicleDetail.getRegistrationNumber());
					vehicleDetailPage newVehicleDetailPage = PageFactory.initElements(webDriver, vehicleDetailPage.class);
					vehicleDetailBean vehicleDetailOnline = newVehicleDetailPage.getVehicleDetails();
					Assert.assertEquals(vehicleDetail.getRegistrationNumber(),
										vehicleDetailOnline.getRegistrationNumber());
					Assert.assertEquals(vehicleDetail.getVehicleMake(),
										vehicleDetailOnline.getVehicleMake());
					Assert.assertEquals(vehicleDetail.getVehicleModel(),
										vehicleDetailOnline.getVehicleModel());
				}
			}
						
			//At last
			browserFactory.closeBrowser();
		
		} catch (Exception excep) {
			// TODO: handle exception
			logger.log(Level.SEVERE, excep.getMessage(), excep);
		}
		
	}
	
}
