package com.stanzaliving.qrcode.exception;


import lombok.Getter;

@Getter
public class QRInvalidScannedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;
	private Object exObject;
	
	public QRInvalidScannedException(String message, Object exObject) {
		super(message);
		this.exObject = exObject;
	}

	public QRInvalidScannedException(Throwable cause) {
		super(cause);
	}

	public QRInvalidScannedException(String message, Throwable cause) {
		super(message, cause);
	}

}