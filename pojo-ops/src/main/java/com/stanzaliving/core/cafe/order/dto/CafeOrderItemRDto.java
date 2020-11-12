package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.DiscountType;
import com.stanzaliving.core.cafe.order.constants.ItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderItemRDto {
    private ItemType type;
    private String itemId;
    private String name;
    private String image;
    private String category;
    private String grammage;
    private boolean featured;
    private String description;
    private boolean containsEggs;
    private boolean nonVeg;


    private Double grossPrice;
    private DiscountType discountType;
    private Double discount;
    private Double netPrice;
    private Double cgstPercentage;
    private Double igstPercentage;
    private Double sgstPercentage;

}
