package com.stanzaliving.core.food.dto;

import java.util.List;
import java.util.Map;

import com.stanzaliving.approval.dto.ApprovalListingDto;
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
public class CityLevelFoodSummaryDto {

	private String cityName;
	private String cityId;

	private List<FoodMenuApprovalSummaryDto> approvalSummaryDtos;

	private String groupId;
	private String groupName;
	private List<StatusCountDto> statusWiseCount;
	//city->mm->category
	private Map<String,CityLevelFoodSummaryDto> childData;

	private String requestDateTimeLabel;
	private String l1ActionDateTimeLabel;
	private String l2ActionDateTimeLabel;
	private String l3ActionDateTimeLabel;
	private String l4ActionDateTimeLabel;
	private String l5ActionDateTimeLabel;
	private String approvalStatus;
	private Double price;
	private String boxOption;
	private String foodServeType;
	private ApprovalListingDto approvalSummary;
	private List<String> residences;
	private String residenceName;
	private String menuStatus;
	private boolean menuApproved;
	private String categoryId;
	private String categoryName;
	private String categoryMealWiseName;
	private List<String> micromarketNameList;
	private String micromarketName;

	private int totalCategory;
	private int notCreated;
	private int inDraft;
	private int submitted;
	private int l1ApprovalPending;
	private int l2ApprovalPending;
	private int l3ApprovalPending;
	private int l4ApprovalPending;
	private int l5ApprovalPending;
	private int approved;

}
