package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.dto.MealCategoryPriceDto;
import com.stanzaliving.food.v2.category.dto.MenuCategoryDTO;
import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.menu.constants.MonthlyBudgetStatus;

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
	private Double monthlyBudget;
	private Map<String, String> tags;
	private List<ListingDto> demographicTags;
    private Integer eventCount;
    
	private String mealWiseName;
	private Double mealPrice;
	private MealCategoryPriceDto mealPriceData;
	private FoodServeType foodServeType;
	private MenuType menuType;

	//Format May'21
	private LocalDate monthYear;
	
	private MonthlyBudgetStatus monthlyBudgetStatus;
	
	private int noOfResidenceServed;
	private List<MenuCategoryResidenceRDto> residences;
	private List<MicromarketRDto> mmServed;
	private int noOfMmServed;

    //Day level (Planned/Budgeted)
    List<DayWiseBudgetDto> dayWiseBudgetDto;
    
}
