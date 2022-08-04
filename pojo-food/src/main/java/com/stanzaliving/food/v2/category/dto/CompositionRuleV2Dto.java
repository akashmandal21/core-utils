package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CompositionRuleV2Dto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long maxAllowedCombo;
    private Long minAllowedCombo;
    private Long actualComboCount;
    
    private Long maxHybridMeals;
    private Long minHybridMeals;
    private Long actualHybridMeals;
    
    private Map<MealType, List<DayOfWeek>> failedComboMeals;
    private Map<MealType, List<DayOfWeek>> failedHybridMeals;
    
    @NotNull(message = "Mandatory Rules Are Empty")
    private List<CompositionConditionV2Dto> mandatoryRules;
    private List<CompositionConditionV2Dto> weeklyRules;
    private List<CompositionConditionV2Dto> dailyRule;
    private List<MealCompositionConditionDto> mealRules;
    @Builder.Default
    private Boolean passed = true;

}
