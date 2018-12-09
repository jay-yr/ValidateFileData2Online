/**
 * 
 */
package com.stepImplementations.fileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.stepImplementations.Beans.fileDetailBean;
import com.stepImplementations.Beans.vehicleDetailBean;

/**
 * @author Jay.YR
 *
 */
public class fileReaderImpl implements fileReaderIntf {

	private File inputDirectory;

	/**
	 * @param inputDirectory
	 */
	public fileReaderImpl(String inputDirectory) {
		this.inputDirectory = new File(inputDirectory);
	}

	/**
	 * Return a list of Files under Directory
	 */
	public File[] traverseDirectory() {
		// TODO Auto-generated method stub
		
		File[] listOfFiles	= inputDirectory.listFiles();
		return listOfFiles;
		
	}

	/**
	 * Returns a FileDetail bean for a Single File
	 * @return 
	 * @throws IOException 
	 */
	public fileDetailBean getFileDetail(File singleFile) 
			throws IOException {
		// TODO Auto-generated method stub
		
		fileDetailBean fileDetail = new fileDetailBean();
		//Set FileName
		fileDetail.setFileName(singleFile.getName());
		//Set FileSize
		fileDetail.setFileSize(singleFile.length());
		//Set File MIME type
		fileDetail.setFileMIMEType(Files.probeContentType(singleFile.toPath()));
		//Set File Extension
		fileDetail.setFileExtension(FilenameUtils.getExtension(singleFile.getName()));
		//Set File 
		fileDetail.setFile(singleFile);
		
		return fileDetail;
		
	}

	public List<vehicleDetailBean> getVehicleDetailsfromExcelfile(File singleFile) 
			throws FileNotFoundException, 
				   IOException{
		// TODO Auto-generated method stub
		
		//Initialize local variable
		List<vehicleDetailBean> vehicleDetailsOnFile 	= new ArrayList<vehicleDetailBean>();
		vehicleDetailBean singleVehicleDetail			= null;
		
		//Open a File Reader for the file and Feed the file reader to Apache POI Workbook
		XSSFWorkbook workBook = new XSSFWorkbook(new FileInputStream(singleFile.getAbsolutePath()));
		//Now read the first WorkSheet of the Workbook
		XSSFSheet workSheet = workBook.getSheetAt(0);
		//Get the last row number on the WorkSheet
		int	rowCount = workSheet.getLastRowNum();
		//ignore the first row and iterate on each row to read the data in WorkSheet
		for(int i=1; i<=rowCount; i++){
			Row	row	= workSheet.getRow(i);
			Iterator<Cell>	cellIterator	= row.cellIterator();	
			singleVehicleDetail = new vehicleDetailBean();
			//in each row iterate cell by cell to read the content
			while (cellIterator.hasNext()) {
				Cell nextCell = cellIterator.next();
				//read the content from cells and map tp Vehicle detail based on Column Index
				switch (nextCell.getColumnIndex()) {
				case 0:	singleVehicleDetail.setRegistrationNumber(nextCell.getStringCellValue());
				case 1: singleVehicleDetail.setVehicleMake(nextCell.getStringCellValue());
				case 2: singleVehicleDetail.setVehicleModel(nextCell.getStringCellValue());
				}
			}
			//Add the Vehicle details to a list
			vehicleDetailsOnFile.add(singleVehicleDetail);				
		}

		return vehicleDetailsOnFile;
	}

	public List<vehicleDetailBean> getVehicelDetailsfromCSVfile(File singleFile)
			throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		List<vehicleDetailBean> vehicleDetailsOnFile 	= new ArrayList<vehicleDetailBean>();
		vehicleDetailBean singleVehicleDetail			= null;
		
		String[] rowCells = null;
		Scanner fileScanner = new Scanner(singleFile);
		//Ignore the header on File
		if (fileScanner.hasNextLine()) {
			fileScanner.nextLine();
		}
		while (fileScanner.hasNextLine()) {
			String fileData = fileScanner.nextLine();
			rowCells =	fileData.split(",");			
			singleVehicleDetail = new vehicleDetailBean();
			for (int i=0; i<rowCells.length; i++){
				switch (i) {
				case 0:	singleVehicleDetail.setRegistrationNumber(rowCells[i]);
				case 1: singleVehicleDetail.setVehicleMake(rowCells[i]);
				case 2: singleVehicleDetail.setVehicleModel(rowCells[i]);
				}
			}
			//Add the Vehicle details to a list
			vehicleDetailsOnFile.add(singleVehicleDetail);	
		}
		fileScanner.close();
		
		return vehicleDetailsOnFile;
	}

	public List<vehicleDetailBean> getVehicelDetailsfromfile(File singleFile,
			fileDetailBean fileToRead) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		
		//Call respective methods accordingly 
		if (fileToRead.getFileExtension().equalsIgnoreCase("csv")) {
			return getVehicelDetailsfromCSVfile(singleFile);
		} else
			if (fileToRead.getFileExtension().equalsIgnoreCase("xls") || fileToRead.getFileExtension().equalsIgnoreCase("xlsx")) {
			return getVehicleDetailsfromExcelfile(singleFile);
		} else{
			return null;
		}
	
	}


}
