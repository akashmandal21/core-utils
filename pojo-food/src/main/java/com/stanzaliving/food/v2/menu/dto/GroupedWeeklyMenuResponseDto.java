package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.approval.dto.ApprovalListingDto;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import com.stanzaliving.food.v2.category.dto.MenuCategoryMealDto;
import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
import com.stanzaliving.food.v2.common.dto.MicromarketRDto;
import com.stanzaliving.food.v2.menu.constants.MenuStatus;
import com.stanzaliving.food.v2.monthlybudgetplanner.dto.SpecialDayMealDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class GroupedWeeklyMenuResponseDto extends AbstractDto {

    private String fullName;
    List<WeeklyMenuDto> weeklyMenuResponseDtoList;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double cogs;
    private Double budget;
    private Double budgetDeviation;
    private int fpsScore;
    private boolean fpsScorePassed;
    private String vendorId;
    private String cityId;
    private String cityName;
    private String vendorName;
    private Long mealsWithRatingLessThanFour;
    private Long dayWithRatingLessThanFour;
    private Long totalDays;
    private Long totalMeals;
    private Integer monthForBudgetPlanner;
    private Integer yearForBudgetPlanner;
    private String categoryId;
    private String categoryUuid;
    private String versionId;
    private boolean compositionRulesSatisfied;
    private boolean budgetUtilizationInLimit;
    private boolean rulesViolated;
    private boolean mealOfDayDefined;
    private Double ratings;
    private boolean comboRulesSatisfied;
    @Builder.Default
    private boolean beverageRuleSatisfied = true;
    private boolean menuDefined;
    private ApprovalStatus approvalStatus;
    private List<String> pendingApprovers;
    private List<UserContactDetailsResponseDto> pendingUsers;
    private ApprovalListingDto approvalData;
    private Date approvalRequestedOn;
    private String approvalRequestedBy;
    private MenuStatus menuStatus;
    private MenuType menuType;
    private FoodServeType foodServeType;
    private List<MenuCategoryResidenceRDto> residences;
    private List<MicromarketRDto> micromarkets;
    private Integer averageMIR;
    private Double mealPrice;
    private String mealWiseName;
    private Map<String, String> tags;
    private Integer noOfWeeks;
    private List<SpecialDayMealDto> specialDayMealDtoList;
    private List<MenuCategoryMealDto> mealData;
    private Boolean canSubmit;
    private Date approvedAt;
    private String approvedBy;
    private Boolean isDebarDishExist;
    private SelectedKitchenDto selectedKitchen;

}
