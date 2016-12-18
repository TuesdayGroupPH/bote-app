package com.bote.tuesdaygroup.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.tuesdaygroup.exception.RequiredFieldException;
import com.bote.tuesdaygroup.util.StringUtil;

public class UpdateCustomerDTO extends CustomerDTO {

	/**
	 * Constructor that initializes the values of the DTO.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public UpdateCustomerDTO(MultivaluedMap<String, String> queryParams)
			throws RequiredFieldException {
		setId(StringUtil.isNullOrBlank(queryParams.getFirst("id")) ? 0L : Long
				.parseLong(queryParams.getFirst("id")));
		setFirstName(queryParams.getFirst("firstName"));
		setLastName(queryParams.getFirst("lastName"));
		setEmailAddress(queryParams.getFirst("emailAddress"));
		setContactNumber(queryParams.getFirst("contactNumber"));

		// checks if all required fields are submitted, throws exception if not
		checkReuiredFields();
	}

	@Override
	public boolean isRequiredFieldMissing() {
		boolean reqFieldMissing = false;
		if (getId() == 0L) {
			messages.add("id");
			reqFieldMissing = true;
		}
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
