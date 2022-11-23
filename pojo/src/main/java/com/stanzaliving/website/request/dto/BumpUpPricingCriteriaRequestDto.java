package com.stanzaliving.website.request.dto;

import java.util.Set;

import com.stanzaliving.core.enums.PropertyEntityType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BumpUpPricingCriteriaRequestDto {

	private Integer bumpUpPricingCriteriaId;

	private Integer minStartingPrice;

	private Integer maxStartingPrice;

	private Double percentage;

	private Boolean isActive;

	private PropertyEntityType propertyEntityType;

	private Set<Integer> cityIds;

	private Set<Integer> micromarketIds;
}
