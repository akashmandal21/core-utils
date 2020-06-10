package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.food.dto.response.VasItemOrderDto;

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
public class VasMealCountSummaryDto {

	private String mealName;

	private Integer vegCount;

	private Integer nonVegCount;

	private List<VasItemOrderDto> vegItems;

	private List<VasItemOrderDto> nonVegItems;

	private Integer totalVegItemQuantity;

	private Integer totalNonVegItemQuantity;

}
