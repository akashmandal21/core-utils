package com.stanzaliving.food.v2.dispatch;


import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrderDispatchUpdateDto {

    private String residenceId;
    private MealType mealType;
    private LocalTime receivingTime;
    private List<UpdateItemDto> updateItemDtoList;
}
