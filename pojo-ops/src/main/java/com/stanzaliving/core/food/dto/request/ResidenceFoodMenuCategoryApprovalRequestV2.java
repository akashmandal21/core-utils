package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.DealCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceFoodMenuCategoryApprovalRequestV2 {

	@NotBlank(message = "Residence can not be blank")
	private String residence;

	private List<String> menuCategoryIdList;

	@NotBlank(message = "Deal Id can not be blank")
	private String dealUuid;

	@NotBlank(message = "Deal Category can not be blank")
	private DealCategory dealCategory;

	@NotNull(message = "Start Date can not be null")
	private LocalDate startDate;

	private LocalDate endDate;

	private boolean serviceMixUpdate;

	@Builder.Default
	private boolean foodDisabled = false;

	private String changedBy;


}
