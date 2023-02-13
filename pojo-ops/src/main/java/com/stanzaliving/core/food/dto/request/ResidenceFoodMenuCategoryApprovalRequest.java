package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.DealCategory;
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
public class ResidenceFoodMenuCategoryApprovalRequest {

	@NotBlank(message = "Residence can not be blank")
	private String residence;

	@NotBlank(message = "Menu Category can not be blank")
	private String menuCategory;

	@NotBlank(message = "Deal Id can not be blank")
	private String dealUuid;

	@NotBlank(message = "Deal Category can not be blank")
	private DealCategory dealCategory;

	@NotNull(message = "Start Date can not be null")
	private LocalDate startDate;

	private boolean serviceMixUpdate;
	
	private String changedBy;

    @Builder.Default
    private boolean foodDisabled = false;

    private LocalDate endDate;

}