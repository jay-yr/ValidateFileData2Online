/**
 * 
 */
package com.stepImplementations.Beans;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * @author Jay YR
 *
 */
@SuppressWarnings("serial")
public class fileDetailBean implements Serializable {

	private	String fileName;
	private String fileMIMEType;
	private	long   fileSize;
	private String fileExtension;
	private	File   file;
	private List<vehicleDetailBean> vehicleDetails;
	/**
	 * 
	 */
	public fileDetailBean() {
	}
	
	/**
	 * @param fileName
	 * @param fileMIMEType
	 * @param fileSize
	 * @param fileExtension
	 */
	public fileDetailBean(String fileName, String fileMIMEType, long fileSize,
			String fileExtension, File file) {
		this.fileName 		= fileName;
		this.fileMIMEType 	= fileMIMEType;
		this.fileSize 		= fileSize;
		this.fileExtension 	= fileExtension;
		this.file			=	file;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileMIMEType
	 */
	public String getFileMIMEType() {
		return fileMIMEType;
	}

	/**
	 * @param fileMIMEType the fileMIMEType to set
	 */
	public void setFileMIMEType(String fileMIMEType) {
		this.fileMIMEType = fileMIMEType;
	}

	/**
	 * @return the fileSize
	 */
	public long getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * @return the fileExtension
	 */
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * @param fileExtension the fileExtension to set
	 */
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	/**
	 * @return the vehicleDetails
	 */
	public List<vehicleDetailBean> getVehicleDetails() {
		return vehicleDetails;
		
	}

	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(List<vehicleDetailBean> vehicleDetails) {
		
		this.vehicleDetails = vehicleDetails;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

}
