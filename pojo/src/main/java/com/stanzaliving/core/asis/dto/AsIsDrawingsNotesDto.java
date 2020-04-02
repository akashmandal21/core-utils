package com.stanzaliving.core.asis.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DTO to represent ASISDrawings Dicsussion notes.
 * 
 * @author debendra.dhinda
 * @since 27-Jan-2020
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AsIsDrawingsNotesDto implements Serializable{

	private static final long serialVersionUID = 1213124159235L;
	
	
	@NotBlank(message = "ASIS uuid can't be empty.")
	private String asIsUuid;
	
	@NotBlank(message = "Date can't be empty.")
	private String date;
	
	@NotBlank(message = "Discussion notes can't be empty.")
	private String notes;
	
	
}
