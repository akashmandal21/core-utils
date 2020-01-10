package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DocumentDto implements Serializable{

	private static final long serialVersionUID = 1237246123L;
	
	/**
	 * Document o/p file name. The name must not contains the extension name.
	 * */
	@NotBlank(message = "The document output file name can't be empty.")
	private String documentOutputFileName;
	
	/**
	 * The absolute generated file path. 
	 * */
	private String generatedDocumentPath;
	
	
	/**
	 * Name of the corresponding caller service. This will prefixed to the 
	 * document output file name. It helps for the tracing of files. 
	 * */
	@NotBlank(message = "The serviceName name can't be empty.")
	private String serviceName;
	
	private boolean isOverride;
	
}
