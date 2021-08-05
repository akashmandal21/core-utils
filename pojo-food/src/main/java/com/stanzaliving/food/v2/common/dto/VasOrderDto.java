package com.stanzaliving.food.v2.common.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
import com.stanzaliving.core.food.enums.VasOrderStatus;
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
public class VasOrderDto extends AbstractDto {

	private static final long serialVersionUID = 4941018952884487151L;

	private String residenceId;

	private LocalDate menuDate;

	private MealType mealType;

	private LocalTime mealStartTime;

	private LocalTime mealEndTime;

	private String userId;

	private VasOrderStatus orderStatus;

	private PackageCollectionStatus packageCollectionStatus;

	private String mappedResidenceId;

	private Double subTotal;

	private Double totalTax;

	private Double grandTotal;
}
