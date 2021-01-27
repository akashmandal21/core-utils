package com.stanzaliving.core.food.dto;

import com.stanzaliving.approval.dto.ApprovalListingDto;
import com.stanzaliving.core.food.enums.FoodMenuStatus;
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
public class FoodMenuApprovalSummaryDto {
	private String cityName;
	private String micromarketName;
	private String categoryName;
	private String menuCategoryId;
	private boolean autoCreated;
	private boolean chefAutoApproved;
	private boolean vendorAutoApproved;
	private ApprovalListingDto approvalSummary;
	private String residenceName;
	private FoodMenuStatus menuStatus;
	private boolean menuApproved;
	private Integer mir;
	private Double price;
	private String boxOption;
}
