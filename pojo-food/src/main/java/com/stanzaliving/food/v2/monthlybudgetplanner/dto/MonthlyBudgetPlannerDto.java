package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.stanzaliving.approval.dto.ApprovalListingDto;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.constant.CategorySearchSortingField;
import com.stanzaliving.food.v2.category.dto.MealCategoryPriceDto;
import com.stanzaliving.food.v2.category.dto.MenuCategoryDTO;
import com.stanzaliving.food.v2.category.dto.MenuCategoryMealDto;
import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
import com.stanzaliving.food.v2.common.constant.SortingType;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.menu.constants.MonthlyBudgetStatus;

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
public class MonthlyBudgetPlannerDto extends MenuCategoryDTO {

	private static final long serialVersionUID = -631333844318576490L;
	private String menuCategoryMonthlyBudgetPlannerId;

	private String menuCategoryId;

	private Double monthlyBudget;
	private Map<String, String> tags;
	private List<ListingDto> demographicTags;
    private Integer eventCount;
    
	private String mealWiseName;
	private Double mealPrice;
	private MealCategoryPriceDto mealPriceData;
	private FoodServeType foodServeType;
	private String foodServeTypeName;
	private MenuType menuType;
	private String menuTypeName;

	//Format May'21
	private LocalDate monthYear;
	
	private MonthlyBudgetStatus monthlyBudgetStatus;
	private String monthlyBudgetStatusName;
	
	private int noOfResidenceServed;
	private List<MenuCategoryResidenceRDto> residences;
	private List<MicromarketRDto> mmServed;
	private int noOfMmServed;

	private List<MenuCategoryMealDto> mealData;
	private ApprovalStatus approvalStatus;
	private ApprovalListingDto approvalData;

    //Day level (Planned/Budgeted)
    List<DayWiseBudgetDto> dayWiseBudgetDto;

    //Sorting Types
	private SortingType sortingType;
	private CategorySearchSortingField sortingField;

	@Builder.Default
	private boolean isDraftVersionAvailable = false;
	private String draftVersionId;

	//week wise sum
	private List<WeeklyPlannerSumDto> weekWiseTotalBudget;
	private Double nextMonthTotalBudget;

    
}
