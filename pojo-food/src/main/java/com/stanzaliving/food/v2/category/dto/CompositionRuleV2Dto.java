package com.stanzaliving.food.v2.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
    @NotNull(message = "Mandatory Rules Are Empty")
    private List<CompositionConditionV2Dto> mandatoryRules;
    private List<CompositionConditionV2Dto> weeklyRules;
    private List<CompositionConditionV2Dto> dailyRule;
    private List<CompositionConditionV2Dto> mealRules;

}
