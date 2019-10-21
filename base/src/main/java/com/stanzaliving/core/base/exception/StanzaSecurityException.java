/**
 * 
 */
package com.stanzaliving.core.base.exception;

import lombok.Getter;

/**
 * 
 * @author naveen
 *
 * @date 17-Oct-2019
 */
@Getter
public class StanzaSecurityException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	private int statusCode;
	
	public StanzaSecurityException(String message) {
		super(message);
	}

	public StanzaSecurityException(Throwable cause) {
		super(cause);
	}

	public StanzaSecurityException(String message, Throwable cause) {
		super(message, cause);
	}

}