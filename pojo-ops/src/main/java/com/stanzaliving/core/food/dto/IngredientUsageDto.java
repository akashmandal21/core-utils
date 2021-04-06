package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientUsageDto {
    private boolean used;
    private Map<String,Boolean> usageMap;
}
