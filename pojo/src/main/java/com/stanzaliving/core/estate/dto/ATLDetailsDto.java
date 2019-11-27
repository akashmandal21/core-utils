package com.stanzaliving.core.estate.dto;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ATLDetailsDto {
	
	private List<ATLClausesDto> atlClausesDtos;

	private Map<String,String> atlDocs;
}
