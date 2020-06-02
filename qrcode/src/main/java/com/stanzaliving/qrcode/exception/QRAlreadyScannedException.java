package com.stanzaliving.qrcode.exception;

import java.util.Date;

import lombok.Getter;

@Getter
public class QRAlreadyScannedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;
	private Date lastUpdatedAt;
	
	public QRAlreadyScannedException(String message,Date scannedTime) {
		super(message);
		this.lastUpdatedAt = scannedTime;
	}

	public QRAlreadyScannedException(Throwable cause) {
		super(cause);
	}

	public QRAlreadyScannedException(String message, Throwable cause) {
		super(message, cause);
	}

}