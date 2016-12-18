package com.bote.tuesdaygroup.exception;


/**
 * Required field exception.
 *
 */
public class RequiredFieldException extends Exception {

	/** generated serial version uid */
	private static final long serialVersionUID = 7912068246846079475L;

	/**
	 * Exception constructor that accepts an exception message.
	 *
	 * @param message
	 */
	public RequiredFieldException(String message) {
		super(message);
	}

}
