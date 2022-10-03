package com.stanzaliving.food.v2.dispatch;


import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Data
@SuperBuilder
public class UpdateItemDto {

    @NotBlank(message = "itemIt can't be blank")
    private String itemId;
    private Integer receivedQuantity;
    private Double receivedWeight;
    private Boolean isShortage;
    private Integer shortagePax;
    private Boolean isLeftover;
    private Integer leftoverQuantity;
    private Double leftoverWeight;

}
