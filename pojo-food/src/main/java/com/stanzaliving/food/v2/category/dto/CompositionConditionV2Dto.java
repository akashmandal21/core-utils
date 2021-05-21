package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.rule.engine.dto.ConditionDto;
import com.stanzaliving.food.v2.category.constant.RuleDuration;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CompositionConditionV2Dto extends ConditionDto {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "Rule Condition is Empty")
    private RuleDuration condition;

    @Builder.Default
    private Boolean passed = true;
}
