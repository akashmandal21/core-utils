package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class ResidenceFoodMenuCategoryApprovalRequest {

	@NotBlank(message = "Residence can not be blank")
	private String residence;

	@NotBlank(message = "Menu Category can not be blank")
	private String menuCategory;

	@NotNull(message = "Start Date can not be null")
	private LocalDate startDate;

	private boolean serviceMixUpdate;

}