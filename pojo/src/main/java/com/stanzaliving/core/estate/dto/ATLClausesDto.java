package com.stanzaliving.core.estate.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class ATLClausesDto {

	private String clauseItem;
	private String scopeDefinition;
	private String duration;
	private String remarks;
	private String clauseApplicable;
	
}
