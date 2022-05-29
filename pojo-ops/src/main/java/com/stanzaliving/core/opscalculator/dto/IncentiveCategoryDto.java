package com.stanzaliving.core.opscalculator.dto;

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
public class IncentiveCategoryDto extends CategoryDto{

	public int incentiveValue;

}
