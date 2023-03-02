package com.stanzaliving.core.food.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

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
public class UserMenuCategoryDtoStayCuration {

	@NotNull(message = "User Id cannot be null")
	private String userId;

	@NotNull(message = "ResidenceUuid cannot be null")
	private String residenceUuid;

	@NotNull(message = "DealUuid cannot be null")
	private String dealUuid;

	@NotNull(message = "DealCategory cannot be null")
	private DealCategory dealCategory;

	private List<UserMenuCategoryPlansDtoStayCuration> planDetails;



}
