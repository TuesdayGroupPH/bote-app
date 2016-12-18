package com.bote.tuesdaygroup.util;

/**
 * String utility class.
 *
 */
public class StringUtil {

	/**
	 * Checks if a string is null or blank.
	 *
	 * @param s
	 * @return true if null or blank, otherwise false
	 */
	public static boolean isNullOrBlank(String s) {
		return s == null || s.isEmpty();
	}
}
