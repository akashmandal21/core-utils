package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;




@Data
public class DocumentGeneratorBaseRequestDto implements Serializable{
	
	
	private static final long serialVersionUID = 4398091L;

	/**
	 * Unique template name for which the document will generate.
	 * 
	 * */
	@NotBlank(message = "Template name can't be blank.")
	private String templateName;
	
	
	/**
	 * template type e.g. FTL/HTML etc.
	 * */
	@NotNull(message = "Template Type can't be empty.")
	private String templateType;
	
	
	/**
	 * Unique Kafka topic name for document response publish.
	 * */
	private String topicName;
		
}
