package com.stanzaliving.website.dto.ui;

import java.io.Serializable;
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
public class FilterComponentUIDtoV2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer cityId;
	private List<FilterBaseUIDto> filtersSection;
	private List<FilterBaseUIDto> sortBySection;
	private List<FilterBaseUIDto> moreFiltersSection;
}
