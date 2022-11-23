package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryResidenceRDto extends ResidenceRDto {
	private LocalDate startDate;
	private LocalDate endDate;
	private String categoryId;
	private String dealId;
	private DealCategory dealCategory;

	private Integer averageMir;


}
