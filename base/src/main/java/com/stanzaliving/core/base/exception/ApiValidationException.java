/**
 *
 */
package com.stanzaliving.core.base.exception;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;
import lombok.ToString;

import java.util.function.Supplier;

@Getter
@ToString(callSuper = true)
public class ApiValidationException extends RuntimeException {

	private static final long serialVersionUID = -4075250719863628707L;

	private final String message;
	private final String code;
	private final Throwable error;
	private ExceptionMarker marker = null;

	public ApiValidationException() {
		this(StringUtils.EMPTY, StringUtils.EMPTY, null);
	}

	public ApiValidationException(String message) {
		this(message, StringUtils.EMPTY, null);
	}

	public ApiValidationException(Throwable cause) {
		this(StringUtils.EMPTY, StringUtils.EMPTY, cause);
	}

	public ApiValidationException(String message, String code) {
		this(message, code, null);
	}

	public ApiValidationException(String message, Throwable cause) {
		this(message, StringUtils.EMPTY, cause);
	}

	public ApiValidationException(String message, String code, Throwable error) {
		this.code = code;
		this.message = message;
		this.error = error;
	}

	public ApiValidationException(ExceptionMarker marker, Throwable error) {
		this.marker = marker;
		this.message = marker.getMessage();
		this.code = marker.getErrorCode();
		this.error = error;
	}

}
