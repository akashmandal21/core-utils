package com.stanzaliving.food.v2.dispatch;


import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;

@Data
@SuperBuilder
public class FoodOrderDispatchUpdateDto {

    private String orderId;
    private LocalTime receivingTime;
    private List<UpdateItemDto> updateItemDtoList;
}
