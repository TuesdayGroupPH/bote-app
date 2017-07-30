package com.bote.delibeery.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

/**
 * DTO class for updating customer information.
 *
 * @author MarkS
 *
 */
public class UpdateCustomerDTO extends CustomerDTO {

	/**
	 * Constructor that initializes the values of the DTO.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public UpdateCustomerDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		super(queryParams);
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
