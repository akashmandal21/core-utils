package com.stanzaliving.website.dto.ui;

import java.util.List;

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
public class FilterComponentUIDto {

	private String name;
	private String flatUrl;
	
	private Integer cityId;
	
	private List<FilterBaseUIDto> value;
}
