package com.stanzaliving.qrcode.exception;


import lombok.Getter;

@Getter
public class QRInvalidScannedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;
	private String invalidMessage;
	
	public QRInvalidScannedException(String message,String invalidMessage) {
		super(message);
		this.invalidMessage = invalidMessage;
	}

	public QRInvalidScannedException(Throwable cause) {
		super(cause);
	}

	public QRInvalidScannedException(String message, Throwable cause) {
		super(message, cause);
	}

}