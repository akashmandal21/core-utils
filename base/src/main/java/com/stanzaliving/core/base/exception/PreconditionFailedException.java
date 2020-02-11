/**
 * 
 */
package com.stanzaliving.core.base.exception;

/**
 * 
 * @author naveen.kumar
 *
 * @date 27-Dec-2019
 *
 */
public class PreconditionFailedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public PreconditionFailedException(String message) {
		super(message);
	}

	public PreconditionFailedException(Throwable cause) {
		super(cause);
	}

	public PreconditionFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}