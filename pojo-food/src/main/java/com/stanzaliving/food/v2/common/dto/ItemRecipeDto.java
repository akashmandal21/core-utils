package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRecipeDto extends AbstractDto {

	private static final long serialVersionUID = 6130185495453417052L;
	private String itemId;
	private int cookQuantity;
	private Double standardQuantity;
	private UnitOfMeasurement unitOfMeasurement;
}
