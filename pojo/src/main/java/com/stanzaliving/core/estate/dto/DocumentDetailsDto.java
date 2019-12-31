package com.stanzaliving.core.estate.dto;

import java.util.List;

import com.stanzaliving.core.estate.enums.DocumentDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DocumentDetailsDto {

	private DocumentDetails documentDetails;
	
	private String uuid;
	
	private String answer;
	
	private String documentDescription;
	
	private List<String> images;
	
	private List<String> comments;
 }
