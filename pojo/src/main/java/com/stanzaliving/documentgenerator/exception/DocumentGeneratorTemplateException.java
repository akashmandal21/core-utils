package com.stanzaliving.documentgenerator.exception;

public class DocumentGeneratorTemplateException extends RuntimeException{
	private static final long serialVersionUID = -3368655266237942363L;

	public DocumentGeneratorTemplateException(String message) {
		super(message);
	}

	public DocumentGeneratorTemplateException(Throwable cause) {
		super(cause);
	}

	public DocumentGeneratorTemplateException(String message, Throwable cause) {
		super(message, cause);
	}

}
