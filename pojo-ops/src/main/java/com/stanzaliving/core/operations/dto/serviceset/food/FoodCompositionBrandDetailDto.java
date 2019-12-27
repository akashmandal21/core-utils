package com.stanzaliving.core.operations.dto.serviceset.food;

import com.stanzaliving.core.operations.dto.serviceset.BrandComponentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodCompositionBrandDetailDto extends BrandComponentDto {

	private int numberOfTimes;

}