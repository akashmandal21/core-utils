/**
 * 
 */
package com.stanzaliving.core.base.exception;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
public class StanzaHttpException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public StanzaHttpException(String message) {
		super(message);
	}

	public StanzaHttpException(Throwable cause) {
		super(cause);
	}

	public StanzaHttpException(String message, Throwable cause) {
		super(message, cause);
	}

}