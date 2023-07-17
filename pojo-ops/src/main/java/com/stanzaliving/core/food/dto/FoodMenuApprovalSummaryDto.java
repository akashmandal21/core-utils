package com.stanzaliving.core.food.dto;

import com.stanzaliving.approval.dto.ApprovalListingDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuApprovalSummaryDto {
	private String cityName;
	private String cityId;
	private String micromarketName;
	private String categoryName;
	private String categoryMealWiseName;
	private String menuCategoryId;
	private String microMarketId;
	private boolean autoCreated;
	private boolean chefAutoApproved;
	private boolean vendorAutoApproved;

	private ApprovalListingDto approvalSummary;
	private String residenceName;
	private String menuStatus;
	private boolean menuApproved;
	private Integer mir;
	private Double price;
	private String boxOption;
	private String foodServeType;

	private String vendorId;
	private String vendorName;

	private String requestDateTimeLabel;
	private String l1ActionDateTimeLabel;
	private String l2ActionDateTimeLabel;
	private String l3ActionDateTimeLabel;
	private String l4ActionDateTimeLabel;
	private String l5ActionDateTimeLabel;
	private String approvalStatus;
}
