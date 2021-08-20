package com.stanzaliving.website.dto.ui;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.website.enums.EnumFilterType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FilterBaseUIDto {

	private Integer sequenceId;
	
	private String name;

	private Object value;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private EnumFilterType filterType;
}
