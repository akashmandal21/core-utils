package com.stanzaliving.qrcode.exception;

import java.util.Date;

public class QRAlreadyScannedException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	public QRAlreadyScannedException(String message,Date scannedTime) {
		super(message);
	}

	public QRAlreadyScannedException(Throwable cause) {
		super(cause);
	}

	public QRAlreadyScannedException(String message, Throwable cause) {
		super(message, cause);
	}

}