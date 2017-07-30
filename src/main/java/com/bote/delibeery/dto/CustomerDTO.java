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
		setLoginId(queryParams.getFirst("loginId"));
		setName(queryParams.getFirst("name"));
		setEmail(queryParams.getFirst("email"));
		setContactNumber(queryParams.getFirst("contactNumber"));
		setPhotoUrl(queryParams.getFirst("photoUrl"));
		setType(queryParams.getFirst("type"));

		// checks if all required fields are submitted, throws exception if not
		checkRequiredFields();
	}

	private long id;
	private String loginId;
	private String name;
	private String email;
	private String contactNumber;
	private String photoUrl;
	private String type;

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
	 * @return the loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId
	 *            the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * @param photoUrl
	 *            the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean isRequiredFieldMissing() {
		return false;
	}

}
