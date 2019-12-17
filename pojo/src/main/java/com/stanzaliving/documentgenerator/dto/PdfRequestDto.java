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
	 * Unique Kafka topic name for document response publish.
	 */
	private String topicName;
}
