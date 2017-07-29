package com.bote.delibeery.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bote.delibeery.exception.RequiredFieldException;

/**
 * This is the base class of DTOs.
 *
 * @author MarkS
 *
 */
public abstract class BaseDTO {

	protected List<String> messages = new ArrayList<>();

	/**
	 * Checks if all the required fields are submitted.
	 *
	 * @throws RequiredFieldException
	 */
	public void checkRequiredFields() throws RequiredFieldException {
		// check if any required fields are missing
		if (isRequiredFieldMissing()) {

			// form the message for the exception
			String message = "Required field/s missing: ";
			for (Iterator<String> itr = messages.iterator(); itr.hasNext();) {
				message += itr.next();
				if (itr.hasNext()) {
					message += ",";
				}
			}

			// throw exception
			throw new RequiredFieldException(message);
		}
	}

	/**
	 * Checks if any of the required fields are missing.
	 *
	 * @return true if a required field is missing, otherwise false
	 */
	public abstract boolean isRequiredFieldMissing();
}
