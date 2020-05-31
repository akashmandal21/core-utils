/**
 * 
 */
package com.stanzaliving.core.base.exception;

/**
 * 
 * @author naveen.kumar
 *
 * @date 29-Mar-2020
 *
 */
public class RequestInProgressException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public RequestInProgressException(String message) {
		super(message);
	}

	public RequestInProgressException(Throwable cause) {
		super(cause);
	}

	public RequestInProgressException(String message, Throwable cause) {
		super(message, cause);
	}

}