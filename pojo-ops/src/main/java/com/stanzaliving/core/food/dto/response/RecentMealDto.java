package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RecentMealDto {

	private boolean isCafe;

	private String masterOrderId;

	private String foodOrderId;

	private String studentId;

	private Integer residenceId;

	private String residenceUuid;

	private LocalDate menuDate;

	EnumListing<MealType> mealType;

	private String nudgeId;


}
