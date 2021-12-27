package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 27-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaTaskAttributeResponse {

    private GarbageCollectionResponseDto garbageCollection;

    private CleaningResponseDto deepCleaning;

    private CleaningResponseDto roomCleaning;

    private CleaningResponseDto sanitization;

    private CleaningResponseDto commonAreaCleaning;

    private MealTypeResponseDto utensilRinsing;

    private MealTypeResponseDto mealServing;

    private MealTypeResponseDto plateCollection;

    private MealTypeResponseDto mealReceiving;
}
