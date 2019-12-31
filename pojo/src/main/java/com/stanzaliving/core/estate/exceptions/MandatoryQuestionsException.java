package com.stanzaliving.core.estate.exceptions;

import java.util.List;
import java.util.Map;

import lombok.Getter;

@Getter
public class MandatoryQuestionsException extends RuntimeException {

	private static final long serialVersionUID = -3368655266237942363L;

	private Map<String, List<Object>> leftOverQuestions;

	public MandatoryQuestionsException(Map<String, List<Object>> leftOverQuestions, String message) {
		super(message);

		this.leftOverQuestions = leftOverQuestions;
	}

}
