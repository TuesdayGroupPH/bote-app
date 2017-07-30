package com.bote.delibeery.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

/**
 * DTO class for customer information.
 *
 */
public class CustomerDTO extends BaseDTO {

	/**
	 * Empty constructor.
	 *
	 */
	public CustomerDTO() {
	}

	/**
	 * Constructor that initializes the values of the DTO.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public CustomerDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		setId(StringUtil.isNullOrBlank(queryParams.getFirst("id")) ? 0L : Long.parseLong(queryParams.getFirst("id")));
		setFirstName(queryParams.getFirst("firstName"));
		setLastName(queryParams.getFirst("lastName"));
		setEmailAddress(queryParams.getFirst("emailAddress"));
		setContactNumber(queryParams.getFirst("contactNumber"));

		// checks if all required fields are submitted, throws exception if not
		checkRequiredFields();
	}

	private long id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String contactNumber;

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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *            the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public boolean isRequiredFieldMissing() {
		return false;
	}

}
