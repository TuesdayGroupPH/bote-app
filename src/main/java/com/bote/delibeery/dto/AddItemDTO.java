package com.bote.delibeery.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

/**
 * DTO class for adding an Item record.
 *
 * @author MarkS
 *
 */
public class AddItemDTO extends ItemDTO {

	/**
	 * Constructor that would check if all the required fields are submitted.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public AddItemDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		super(queryParams);
	}

	@Override
	public boolean isRequiredFieldMissing() {
		boolean reqFieldMissing = false;

		if (StringUtil.isNullOrBlank(getCode())) {
			messages.add("code");
			reqFieldMissing = true;
		}

		if (StringUtil.isNullOrBlank(getDescription())) {
			messages.add("description");
			reqFieldMissing = true;
		}

		if (getUnitPrice() == null) {
			messages.add("unitPrice");
			reqFieldMissing = true;
		}

		return reqFieldMissing;
	}

}
