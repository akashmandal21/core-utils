package com.stanzaliving.food.v2.dispatch;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.operations.enums.DealCategory;

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
public class DealWiseFoodOrderSummaryDispatchDto {

	private String dealId;

	private DealCategory dealCategory;
	
	private LocalDate menuDate;

	private List<FoodOrderSummaryDispatchDto> foodOrderSummaryDispatchDtoList;

}
