package com.bote.delibeery.dto;

import javax.ws.rs.core.MultivaluedMap;

import com.bote.delibeery.exception.RequiredFieldException;
import com.bote.delibeery.util.StringUtil;

public class AddAddressDTO extends AddressDTO {

	/**
	 * Constructor that checks that all the required fields are submitted to the
	 * service.
	 *
	 * @param queryParams
	 * @throws RequiredFieldException
	 */
	public AddAddressDTO(MultivaluedMap<String, String> queryParams) throws RequiredFieldException {
		super(queryParams);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bote.delibeery.dto.AddressDTO#isRequiredFieldMissing()
	 */
	@Override
	public boolean isRequiredFieldMissing() {
		boolean reqFieldMissing = false;

		if (StringUtil.isNullOrBlank(getUnitFloorHouseNum())) {
			messages.add("unit #/floor/house #");
			reqFieldMissing = true;
		}

		if (StringUtil.isNullOrBlank(getStreet())) {
			messages.add("street");
			reqFieldMissing = true;
		}

		if (StringUtil.isNullOrBlank(getCity())) {
			messages.add("city");
			reqFieldMissing = true;
		}

		if (getCustomerId() == 0L) {
			messages.add("customerId");
			reqFieldMissing = true;
		}

		return reqFieldMissing;
	}

}
