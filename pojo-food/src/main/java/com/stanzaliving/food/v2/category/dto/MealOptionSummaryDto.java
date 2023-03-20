package com.stanzaliving.food.v2.category.dto;

import java.io.Serializable;
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
public class MealOptionSummaryDto implements Serializable {
    private MealOptionDto mealOptionDto;
    @Builder.Default
    private String beverageHash = "";
}
