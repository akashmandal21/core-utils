package com.stanzaliving.food.v2.dispatch;

import com.stanzaliving.core.operations.enums.DealCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DealWiseFoodOrderSummaryDispatchDto {

	private String dealId;

	private DealCategory dealCategory;

	private List<FoodOrderSummaryDispatchDto> foodOrderSummaryDispatchDtoList;

}
