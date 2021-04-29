package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
    private List<MenuCategoryMealDto> mealData;
    private CategoryStatus categoryStatus;
    private FoodServeType foodServeType;
    private Integer maxWeeklyCombo;
    private boolean sampleMenuDefined;
    private boolean grammageDefined;
    private String grammageRuleId;
    private List<ListingDto> demographicTags;

    //derived information
    private Double mealPrice;
    private int totalMealInWeek;
    private List<String> draftVersions;
    private String mealWiseName;
    private String fullName;
    private List<ResidenceRDto> residences;
    private int noOfResidenceServed;


    //approvalData
    private ApprovalStatus approvalStatus;
    private List<String> pendingApprovers;

    private CompositionRuleV2Dto compositionRules;
    private List<DayWiseSampleMenuDto> dayWiseMenu;
}
