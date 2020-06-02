package com.stanzaliving.qrcode.exception;

import lombok.Getter;

@Getter
public class QRAlreadyScannedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;
	private Object exObject;
	
	public QRAlreadyScannedException(String message, Object exObject) {
		super(message);
		this.exObject = exObject;
	}

	public QRAlreadyScannedException(Throwable cause) {
		super(cause);
	}

	public QRAlreadyScannedException(String message, Throwable cause) {
		super(message, cause);
	}

}