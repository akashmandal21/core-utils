package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.dto.FoodMenuBudgetDto;
import com.stanzaliving.core.food.dto.response.SpecialEventDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.dto.BeverageRuleDto;
import com.stanzaliving.food.v2.category.dto.CompositionRuleV2Dto;
import com.stanzaliving.food.v2.category.dto.DayWiseCogsDto;
import com.stanzaliving.food.v2.category.dto.MealWiseMenuDto;
import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.menu.constants.MenuStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class WeeklyMenuDto extends AbstractDto {

    private String vendorId;
    private String cityId;
    private String cityName;
    private String vendorName;
    private LocalDate startDate;
    private String categoryUuid;
    private String versionId;
    private String categoryId;
    private MenuType menuType;
    private FoodServeType foodServeType;
    private String mealWiseName;
    private String fullName;
    private Double mealPrice;
    private MenuStatus menuStatus;
    private Double menuRating;
    private Double mmRating;
    private boolean rulesViolated;
    private int fpsScore;
    private boolean fpsScorePassed;
    private boolean newnessAdherence;
    private Double currentWeekBudget;
    private Double currentWeekCogs;
    private Double currentWeekBudgetDeviation;
    private Double mtdBudget;
    private Double mtdCogs;
    private int mtdBudgetDeviation;
    private Long mealsWithRatingLessThanFour;
    private Long dayWithRatingLessThanFour;
    private Double averageRating;
    private String multiOptionMeals;
    private String menuWeek;
    private Integer averageMIR;
    private List<MicromarketRDto> micromarkets;
    private boolean compositionRulesSatisfied;
    private boolean comboRulesSatisfied;
    private boolean budgetUtilizationInLimit;
    private boolean weeklyBudgetUtilizationInLimit;
    private String weeklyBudgetUtilizationInMessage;
    private boolean hybridMealRuleSatisfied;
    private boolean mealOfDayDefined;
    private boolean menuDefined;
    private Double newnessPercentage;
    private Double ratings;
    private boolean editingAllowed;
    private boolean comboAllowed;
    private List<MealWiseMenuDto> mealWiseMenus;
    private List<DayWiseCogsDto> dayWiseCogs;
    private CompositionRuleV2Dto rules;
    private BeverageRuleDto beverageRuleDto;
    private FoodMenuBudgetDto budgetRules;
    private List<MenuCategoryResidenceRDto> residences;
    private List<SpecialEventDto> events;
    @Builder.Default
    private boolean grammageRangeRuleApplied = true;
    private Double minimumBy;
    private Double maximumBy;
}
