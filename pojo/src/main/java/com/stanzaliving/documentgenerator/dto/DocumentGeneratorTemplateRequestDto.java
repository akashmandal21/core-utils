package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;
import java.util.Map;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Base Template DTO representation for template processor of Document generator service.
 * 
 * @author debendra.dhinda
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocumentGeneratorTemplateRequestDto implements Serializable {

	private static final long serialVersionUID = 4398091L;

	/**
	 * Unique template name for which the document will generate.
	 * 
	 */
	@NotBlank(message = "Template name can't be blank.")
	private String templateName;

	/**
	 * template type e.g. FTL/HTML etc.
	 */
	@NotBlank(message = "Template Type can't be empty.")
	private String templateType;

	/**
	 * Data to be substitute for the place holders.
	 */
	private Map<String, Object> templateModelData;
}