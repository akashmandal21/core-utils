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
    private List<MealTypeResponseDto> mealType;
    private List<CleaningResponseDto> cleaning;
}
