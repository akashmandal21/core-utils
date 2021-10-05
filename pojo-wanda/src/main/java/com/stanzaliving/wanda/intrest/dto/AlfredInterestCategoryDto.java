package com.stanzaliving.wanda.intrest.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlfredInterestCategoryDto {

	List<InterestCategoryDto> categories;
	
	@Builder.Default
	private Integer minCategoryCount = 5;
	
	@Builder.Default
	private Integer minInterestCount = 5 ;
}
