package com.stanzaliving.website.response.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BumpUpPricingCriteriaResponseDTO {

	private int bumpUpPricingCriteriaId;
	private Integer minStartingPrice;
	private Integer maxStartingPrice;
	private Double percentage;
	
	@Builder.Default
	private Set<Integer> cityIds = new HashSet<>();
	
	@Builder.Default
	private Set<Integer> micromarketIds = new HashSet<>();
}
