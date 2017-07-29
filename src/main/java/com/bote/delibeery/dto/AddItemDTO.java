package com.bote.delibeery.dto;

import java.math.BigDecimal;

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

	public AddItemDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		setCode(queryParams.getFirst("code"));
		setDescription(queryParams.getFirst("description"));
		if (!StringUtil.isNullOrBlank(queryParams.getFirst("unitPrice"))) {
			setUnitPrice(new BigDecimal(queryParams.getFirst("unitPrice")));
		}

		// check if any required field is missing
		checkRequiredFields();
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
