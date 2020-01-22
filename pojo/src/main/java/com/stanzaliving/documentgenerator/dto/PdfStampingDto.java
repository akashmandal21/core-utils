package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A DTO represents the stamping of data on existing pdf.
 * 
 * @see PdfStampingDataDto

 * @author debendra.dhinda
 * @since 14-Jan-2020
 * */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PdfStampingDto implements Serializable {

	private static final long serialVersionUID = 1932L;

	/**
	 * List of {@link PdfDocumentDto}
	 */
	@Valid
	private List<PdfStampingDataDto> pdfStampingDataDtos;

	
	/**
	 * The absolute path of the newly generated pdf file.
	 * */
	private String generatedDocumentPath;
	
	/**
	 * Original Pdf absolute file path.
	 * */
	@NotEmpty(message = "Original pdf file path can't be empty.")
	private String originalPdfFilePath;
	
	/**
	 * S3 bucket name to which the generated pdf will upload.
	 * */
	@NotEmpty(message = "Upload to S3 bucket name can't be empty.")
	private String uploadToS3BucketName;
	
	
	/**
	 * Name of the corresponding caller service. This will prefixed to the 
	 * document output file name. It helps for the tracing of files. 
	 * */
	@NotBlank(message = "The serviceName name can't be empty.")
	private String serviceName;
	
}
