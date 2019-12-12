package com.stanzaliving.documentgenerator.exception;

public class DocumentGeneratorException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	
	public DocumentGeneratorException(String message) {
		super(message);
	}

	public DocumentGeneratorException(Throwable cause) {
		super(cause);
	}

	public DocumentGeneratorException(String message, Throwable cause) {
		super(message, cause);
	}
}
