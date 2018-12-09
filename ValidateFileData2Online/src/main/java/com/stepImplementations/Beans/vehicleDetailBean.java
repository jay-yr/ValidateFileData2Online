/**
 * 
 */
package com.stepImplementations.Beans;

import java.io.Serializable;

/**
 * @author Jay.YR
 *
 */
@SuppressWarnings("serial")
public class vehicleDetailBean implements Serializable {

	/**
	 * 
	 */
	private String registrationNumber;
	private String vehicleMake;
	private String vehicleModel;
	
	/**
	 * 
	 */
	public vehicleDetailBean() {
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the vehicleMake
	 */
	public String getVehicleMake() {
		return vehicleMake;
	}

	/**
	 * @param vehicleMake the vehicleMake to set
	 */
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	/**
	 * @return the vehicleModel
	 */
	public String getVehicleModel() {
		return vehicleModel;
	}

	/**
	 * @param vehicleModel the vehicleModel to set
	 */
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
}
