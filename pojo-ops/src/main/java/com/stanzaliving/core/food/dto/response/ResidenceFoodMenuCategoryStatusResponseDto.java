package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
public class ResidenceFoodMenuCategoryStatusResponseDto {

	private boolean draftAvailable;

	private String menuCategory;

	private String menuCategoryName;

	private LocalDate startDate;
	
	private boolean serviceMixUpdate;

	private boolean submitForApprovalEnable;

	private boolean approvalPending;
	
	private Date submitDateTime;
	
	private String message;
	
	private List<String> approvers;
	
	private boolean upcomingCategoryExists;
	
	private String upcomingCategory;
	
	private LocalDate upcomingCategoryEffectiveStartDate;
	
	private String draftCategory;
	
	private String draftCategoryName;
	
	private LocalDate draftStartdate;

}
