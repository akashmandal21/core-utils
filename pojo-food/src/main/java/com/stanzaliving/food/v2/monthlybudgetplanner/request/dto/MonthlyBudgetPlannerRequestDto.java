package com.stanzaliving.food.v2.monthlybudgetplanner.request.dto;

import java.util.List;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.food.v2.category.constant.CategorySearchSortingField;
import com.stanzaliving.food.v2.common.constant.SortingType;
import com.stanzaliving.food.v2.menu.constants.MonthlyBudgetStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MonthlyBudgetPlannerRequestDto {

	@NotNull(message = "month cannot be null")
	private Integer month;

	@NotNull(message = "year cannot be null")
	private Integer year;

	private String vendorId;

	private SortingType sortingType;

	private CategorySearchSortingField sortingField;

	private List<String> menuCategoryIds;

	private List<String> residenceIds;

	private List<MonthlyBudgetStatus> planningStatus;

	private List<ApprovalStatus> approvalStatus;

	private boolean approvalDashboard;

}
