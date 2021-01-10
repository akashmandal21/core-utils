package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class StaffActualUtilisationDto {
	
	private LocalDate date;

	private MealType meal;

	@Builder.Default
	private Integer slStaff = 0;

	@Builder.Default
	private Integer nonSlStaff = 0;

	@Builder.Default
	private Double slStaffCost = 0d;

	@Builder.Default
	private Double nonSlstaffCost = 0d;

}
