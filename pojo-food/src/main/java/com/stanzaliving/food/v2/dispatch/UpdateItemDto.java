package com.stanzaliving.food.v2.dispatch;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateItemDto {

    @NotBlank(message = "itemId can't be blank")
    private String itemId;
    private Integer receivedQuantity;
    private Double receivedWeight;
    private Boolean isShortage;
    private Integer shortagePax;
    private Boolean isLeftover;
    private Integer leftoverQuantity;
    private Double leftoverWeight;

}
