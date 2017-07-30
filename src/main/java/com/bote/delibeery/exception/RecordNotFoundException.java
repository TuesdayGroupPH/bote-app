package com.bote.delibeery.exception;

/**
 * Exception class when a record is not found.
 *
 * @author MarkS
 *
 */
public class RecordNotFoundException extends Exception {

	/** generated serial version uid */
	private static final long serialVersionUID = -163007089358574537L;

	/**
	 * Creates exception class with a message.
	 *
	 * @param message
	 */
	public RecordNotFoundException(String message) {
		super(message);
	}

}
