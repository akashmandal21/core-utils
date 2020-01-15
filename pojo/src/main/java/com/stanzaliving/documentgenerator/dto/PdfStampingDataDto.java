package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 * A DTO representation to stamp additional data on an existing PDF.
 * 
 * @author debendra.dhinda
 * @since 14-Jan-2020
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PdfStampingDataDto implements Serializable {

	
	private static final long serialVersionUID = 189457L;

	/**
	 * The x-coordinate of the stamping text
	 */
	private float xCoordinate;

	/**
	 * The y-coordinate of the stamping text
	 */
	private float yCoordinate;

	/**
	 * The text to be append to the (x,y) coordinate
	 */
	@NotBlank(message = "The stamping text can't be empty.")
	private String stampingText;

	/**
	 * The page number to which the text will be append.
	 * <p>The page number starts from 1 and so on. If the specified page number doesn't exists,
	 * will throw an error message.</p>
	 */
	private Integer pageNumber;

	/**
	 * Font size of the stamping text.
	 * Default to 10.
	 * */
	@Default
	private float stampingTextFontSize = 10f;
}
