package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;

import javax.validation.Valid;

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
public class PdfDocumentDto implements Serializable{

	private static final long serialVersionUID = 11231290L;

	@Valid
	private DocumentGeneratorTemplateRequestDto templateDto;
	@Valid
	private DocumentDto documentDto;
		
}
