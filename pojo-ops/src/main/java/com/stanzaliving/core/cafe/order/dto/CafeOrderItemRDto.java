package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.DiscountType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderItemRDto {
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
    private Double cgst;
    private Double igst;
    private Double sgst;
    //price = (grossPrice-discount)*(1+(cgst+igst+sgst)/100)
    private Double price;

}
