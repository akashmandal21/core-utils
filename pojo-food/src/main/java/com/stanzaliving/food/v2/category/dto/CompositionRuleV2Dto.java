package com.stanzaliving.food.v2.category.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CompositionRuleV2Dto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer maxAllowedCombo;
    @NotNull(message = "Mandatory Rules Are Empty")
    private List<CompositionConditionV2Dto> mandatoryRules;
    private List<CompositionConditionV2Dto> weeklyRules;
    private List<CompositionConditionV2Dto> dailyRule;
    private List<MealCompositionConditionDto> mealRules;
    @Builder.Default
    private Boolean passed = true;

}
