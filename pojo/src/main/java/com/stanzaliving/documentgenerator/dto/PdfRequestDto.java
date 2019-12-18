package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import com.stanzaliving.core.pojo.EmailDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A DTO to represent PDF request.
 * 
 * @see PdfDocumentDto
 * @see EmailDto
 * @author debendra.dhinda
 * @since 17-Dec-2019
 * */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PdfRequestDto implements Serializable {

	private static final long serialVersionUID = 1932L;

	/**
	 * List of {@link PdfDocumentDto}
	 */
	@Valid
	private List<PdfDocumentDto> pdfDocumentDtos;

	/**
	 * {@link EmailDto}
	 */
	private EmailDto emailDto;

	/**
	 * Used to identify the response of the corresponding micro service.
	 * DocumentGenerator service will publish the response on kafka topic
	 * if this attribute value is not {@code null}. During the consumption
	 * of individual micro service, they can able to identify their
	 * corresponding response based on this value.
	 * 
	 */
	private String reponseTopicIdentifier;
}
