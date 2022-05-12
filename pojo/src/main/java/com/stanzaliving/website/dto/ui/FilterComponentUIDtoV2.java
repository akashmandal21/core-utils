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
public class FilterComponentUIDtoV2 {
	private String name;
	
	private Integer cityId;
	
	private List<FilterBaseUIDto> staticFilters;
	private List<FilterBaseUIDto> sortByFilter;
	private List<FilterBaseUIDto> moreFilters;

}
