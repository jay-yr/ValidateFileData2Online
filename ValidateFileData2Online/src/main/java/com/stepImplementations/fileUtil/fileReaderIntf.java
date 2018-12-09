package com.stepImplementations.fileUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.stepImplementations.Beans.fileDetailBean;
import com.stepImplementations.Beans.vehicleDetailBean;

public interface fileReaderIntf {
	
	
	//Traverse a given Input Directory for files
	public File[] traverseDirectory();
	
	//Add the File details
	public fileDetailBean	getFileDetail(File singleFile) throws IOException;
	
	//Read VehicleDetail from the Excel file
	public List<vehicleDetailBean> getVehicleDetailsfromExcelfile(File singleFile) throws FileNotFoundException, IOException;
	
	//Read VehicleDetail from the CSV File
	public List<vehicleDetailBean> getVehicelDetailsfromCSVfile(File singleFile) throws FileNotFoundException, IOException;
	
	//Read VehicleDetail from the file
	public List<vehicleDetailBean> getVehicelDetailsfromfile(File singleFile, fileDetailBean fileToRead) throws FileNotFoundException, IOException;
	
	
}
