package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * A DTO representation for the pdf document creation.
 * 
 * @author debendra.dhinda
 * */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PdfDocumentDto extends DocumentGeneratorTemplateRequestDto implements Serializable{

	private static final long serialVersionUID = 11231290L;
	
	
	/**
	 * Generated Pdf Document file name
	 * */
	@NotBlank(message = "Pdf name can't be empty.")
	private String pdfName;
	
	/**
	 * Generated Pdf file path.
	 * */
	private String pdfPath;
	
	/**
	 * Unique Kafka topic name for document response publish.
	 * */
	private String topicName;
		
	
	
}
