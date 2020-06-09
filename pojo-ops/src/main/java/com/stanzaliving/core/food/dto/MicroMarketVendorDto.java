package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MicroMarketVendorDto extends AbstractDto {

	private String micromarketId;

	private MealType mealType;

	private String vendorId;

	private boolean primary;

}
