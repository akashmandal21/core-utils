package com.stanzaliving.core.operations.dto.serviceset.food;

import java.time.LocalTime;

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
public class FoodCanteenBrandDetailDto extends BrandComponentDto {

	private LocalTime startTime;

	private LocalTime endTime;

	private boolean available;

	private boolean availableAsVas;

}