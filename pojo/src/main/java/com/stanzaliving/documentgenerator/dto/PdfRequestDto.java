package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;
import java.util.Map;

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
public class PdfRequestDto extends DocumentGeneratorBaseRequestDto implements Serializable{

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
	 * Data to be substitute for the place holders.
	 * */
	private Map<String, Object> pdfData;
		
	
	
}
