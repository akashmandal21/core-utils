package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.dto.FoodMenuBudgetDto;
import com.stanzaliving.core.food.enums.BrmUpdationType;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.grammage.category.response.CategoryGrammageBaseResponseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryDetailDto extends MenuCategoryDTO {

	private static final long serialVersionUID = -7523293067980628104L;

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
	private Integer minWeeklyCombo;

	private Integer minHybridMeals;
	private Integer maxHybridMeals;

	private boolean sampleMenuDefined;
	private boolean grammageDefined;
	private List<ListingDto> demographicTags;
	private boolean costUpdated;
	private boolean publishable;
	private boolean customMapApplicable;

	// derived information
	private int totalMealInWeek;
	private List<MenuCategoryDetailDto> draftVersions;
	private String mealWiseName;
	private String fullName;
	private List<MenuCategoryResidenceRDto> residences;
	private int noOfResidenceServed;
	private List<MicromarketRDto> mmServed;
	private int noOfMmServed;

	// approvalData
	private ApprovalStatus approvalStatus;
	private List<String> pendingApprovers;
	private List<UserContactDetailsResponseDto> pendingUsers;
	private Date approvalRequestedOn;
	private String approvalRequestedBy;

	private CompositionRuleV2Dto compositionRules;
	private BeverageRuleDto beverageRuleDto;
	private BeverageRuleDto defaultBeverageRuleDto;
	private List<MealWiseMenuDto> mealWiseMenus;
	private MealCategoryPriceDto mealPriceData;

	// GrammageData
	private int override;
	private List<CategoryGrammageBaseResponseDto> grammageVariationDtos;

	private FoodMenuBudgetDto budgetRules;
	private boolean budgetUtilizationInLimit;

	// Tags
	private Map<String, String> tags;

	@Builder.Default
	private Double menuBudgetMultiplier = 1.0;

	@Builder.Default
	private boolean grammageRangeRuleApplied = true;

	private Double minimumBy;

	private Double maximumBy;

	private Boolean isDebarDishExist;

	private BrmUpdationType brmUpdationType;

	private boolean beverageRuleApplicable;
}