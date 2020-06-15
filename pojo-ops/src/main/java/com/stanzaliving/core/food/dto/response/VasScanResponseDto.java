package com.stanzaliving.core.food.dto.response;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.food.dto.VasItemDto;
import com.stanzaliving.core.operations.enums.MealType;

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
public class VasScanResponseDto {

	private List<VasItemDto> vasItemDtos;
	
	private String mealType;
	
	private Date scanTime;
	
	private Double totalPayment;
}
