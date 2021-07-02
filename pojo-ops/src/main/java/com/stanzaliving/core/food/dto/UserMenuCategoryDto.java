package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.operations.enums.ResidentStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserMenuCategoryDto {

	@NotNull(message = "User Id cannot be null")
	private String userId;

	@NotNull(message = "ResidenceUuid cannot be null")
	private String residenceUuid;

	@NotNull(message = "Menu CategoryId cannot be null")
	private String menuCategoryId;

	@NotNull(message = "DealUuid cannot be null")
	private String dealUuid;

	@NotNull(message = "DealCategory cannot be null")
	private DealCategory dealCategory;

	@NotNull(message = "ResidentStatus cannot be null")
	private ResidentStatus residentStatus;
	
	private LocalDate toDate;

	private LocalDate fromDate;

}
