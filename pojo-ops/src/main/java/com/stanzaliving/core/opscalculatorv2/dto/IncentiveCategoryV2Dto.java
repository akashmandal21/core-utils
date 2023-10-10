package com.stanzaliving.core.opscalculatorv2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class IncentiveCategoryV2Dto extends CategoryV2Dto {

	public boolean incentiveApplicable;
	public double incentiveCost;

}
