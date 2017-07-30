package com.bote.delibeery.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

/**
 * This is the DTO class for Address information
 *
 * @author MarkS
 *
 */
public class AddressDTO extends BaseDTO {

	/**
	 * Empty constructor.
	 *
	 */
	public AddressDTO() {
	}

	/**
	 * Constructor that initializes the DTO.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public AddressDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		setId(StringUtil.isNullOrBlank(queryParams.getFirst("id")) ? 0L : Long.parseLong(queryParams.getFirst("id")));
		setUnitFloorHouseNum(queryParams.getFirst("unitFloorHouseNum"));
		setBuilding(queryParams.getFirst("building"));
		setStreet(queryParams.getFirst("street"));
		setBarangaySubdivision(queryParams.getFirst("barangaySubdivision"));
		setCity(queryParams.getFirst("city"));
		setCustomerId(StringUtil.isNullOrBlank(queryParams.getFirst("customerId")) ? 0L : Long.parseLong(queryParams
				.getFirst("customerId")));

		// checks if all required fields are submitted, throws exception if not
		checkRequiredFields();
	}

	private long id;
	private String unitFloorHouseNum;
	private String building;
	private String street;
	private String barangaySubdivision;
	private String city;
	private long customerId;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the unitFloorHouseNum
	 */
	public String getUnitFloorHouseNum() {
		return unitFloorHouseNum;
	}

	/**
	 * @param unitFloorHouseNum
	 *            the unitFloorHouseNum to set
	 */
	public void setUnitFloorHouseNum(String unitFloorHouseNum) {
		this.unitFloorHouseNum = unitFloorHouseNum;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building
	 *            the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the barangaySubdivision
	 */
	public String getBarangaySubdivision() {
		return barangaySubdivision;
	}

	/**
	 * @param barangaySubdivision
	 *            the barangaySubdivision to set
	 */
	public void setBarangaySubdivision(String barangaySubdivision) {
		this.barangaySubdivision = barangaySubdivision;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	@Override
	public boolean isRequiredFieldMissing() {
		return false;
	}

}
