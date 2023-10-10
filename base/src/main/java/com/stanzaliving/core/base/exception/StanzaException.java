/**
 * 
 */
package com.stanzaliving.core.base.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@Getter
@ToString(callSuper = true)
@ResponseStatus(code = HttpStatus.ACCEPTED)
public class StanzaException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public StanzaException(String message) {
		super(message);
	}

	public StanzaException(Throwable cause) {
		super(cause);
	}

	public StanzaException(String message, Throwable cause) {
		super(message, cause);
	}

}