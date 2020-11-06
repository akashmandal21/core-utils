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
public class CafeOrderItemPDto {
    private ItemType type;
    private String itemId;
    private String grammage;
    private Integer quantity;

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
