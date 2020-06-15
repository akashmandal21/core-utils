package com.stanzaliving.core.food.dto.response;

import java.util.List;

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
public class VasOrderSummaryDto {

	private String residenceName;

	private String mealType;

	private String menuDate;

	private List<VasResidentOrderDto> vasResidentOrderDtos;

}
