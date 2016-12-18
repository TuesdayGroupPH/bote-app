package com.bote.tuesdaygroup.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.tuesdaygroup.exception.RequiredFieldException;
import com.bote.tuesdaygroup.util.StringUtil;

/**
 * DTO class for registering customers.
 *
 */
public class RegisterCustomerDTO extends CustomerDTO {

	/**
	 * Constructor that initializes the values of the DTO.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public RegisterCustomerDTO(MultivaluedMap<String, String> queryParams)
			throws RequiredFieldException {
		setFirstName(queryParams.getFirst("firstName"));
		setLastName(queryParams.getFirst("lastName"));
		setEmailAddress(queryParams.getFirst("emailAddress"));
		setContactNumber(queryParams.getFirst("contactNumber"));

		// checks if all required fields are submitted, throws exception if not
		checkReuiredFields();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bote.tuesdaygroup.dto.CustomerDTO#isRequiredFieldMissing()
	 */
	@Override
	public boolean isRequiredFieldMissing() {
		boolean reqFieldMissing = false;
		if (StringUtil.isNullOrBlank(getFirstName())) {
			messages.add("firstName");
			reqFieldMissing = true;
		}
		if (StringUtil.isNullOrBlank(getLastName())) {
			messages.add("lastName");
			reqFieldMissing = true;
		}
		if (StringUtil.isNullOrBlank(getEmailAddress())) {
			messages.add("emailAddress");
			reqFieldMissing = true;
		}
		if (StringUtil.isNullOrBlank(getContactNumber())) {
			messages.add("contactNumber");
			reqFieldMissing = true;
		}

		return reqFieldMissing;
	}

}
