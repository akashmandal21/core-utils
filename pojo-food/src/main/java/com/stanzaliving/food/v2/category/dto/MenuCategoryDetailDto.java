package com.stanzaliving.food.v2.category.dto;


import java.util.Date;
import java.util.List;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.grammage.category.response.CategoryGrammageBaseResponseDto;
import com.stanzaliving.food.v2.menu.dto.DayWiseCogsDto;

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
public class MenuCategoryDetailDto extends MenuCategoryDTO {
	private String versionId;
	private MenuType menuType;
	private Double marginPercentage;
	private Double utilityCost;
	private Double packagingCost;
	private Double transportCost;
	private Double incentiveCost;
	private Double serviceStaffCost;
	private List<MenuCategoryMealDto> mealData;
	private List<DayWiseCogsDto> dayWiseCogs;
	private CategoryStatus categoryStatus;
	private FoodServeType foodServeType;
	private Integer maxWeeklyCombo;
	private boolean sampleMenuDefined;
	private boolean grammageDefined;
	private List<ListingDto> demographicTags;
	private boolean costUpdated;
	private boolean publishable;

	//derived information
	private int totalMealInWeek;
	private List<MenuCategoryDetailDto> draftVersions;
	private String mealWiseName;
	private String fullName;
	private List<MenuCategoryResidenceRDto> residences;
	private int noOfResidenceServed;
	private List<MicromarketRDto> mmServed;
	private int noOfMmServed;


	//approvalData
	private ApprovalStatus approvalStatus;
	private List<String> pendingApprovers;
	private List<UserContactDetailsResponseDto> pendingUsers;
	private Date approvalRequestedOn;
	private String approvalRequestedBy;

	private CompositionRuleV2Dto compositionRules;
	private List<MealWiseSampleMenuDto> mealWiseMenu;
	private MealCategoryPriceDto mealPriceData;
	
	//GrammageData
	private int override;
	private List<CategoryGrammageBaseResponseDto> grammageVariationDtos;
}
