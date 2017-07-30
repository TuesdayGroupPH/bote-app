package com.bote.delibeery.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

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
	public RegisterCustomerDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		super(queryParams);
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
