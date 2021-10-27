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
        private List<GarbageCollectionResponseDto> garbageCollectionList;
        private List<CleaningResponseDto> deepCleaningList;
        private List<CleaningResponseDto> roomCleaningList;
        private List<CleaningResponseDto> sanitizationList;
        private List<CleaningResponseDto> commonAreaCleaningList;
        private List<MealTypeResponseDto> utensilRinsingList;
        private List<MealTypeResponseDto> mealServingList;
        private List<MealTypeResponseDto> plateCollectionList;
        private List<MealTypeResponseDto> mealReceivingList;
}
