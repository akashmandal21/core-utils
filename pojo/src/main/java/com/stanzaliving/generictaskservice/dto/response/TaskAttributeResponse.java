package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 18-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskAttributeResponse {
        private List<GarbageCollectionResponseDto> garbageCollection;
        private List<CleaningResponseDto> deepCleaning;
        private List<CleaningResponseDto> roomCleaning;
        private List<CleaningResponseDto> sanitization;
        private List<CleaningResponseDto> commonAreaCleaning;
        private List<MealTypeResponseDto> utensilRinsing;
        private List<MealTypeResponseDto> mealServing;
        private List<MealTypeResponseDto> plateCollection;
        private List<MealTypeResponseDto> mealReceiving;
}
