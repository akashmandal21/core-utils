package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.dto.CafeVasItemDto;
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
public class OrderedItemRDto {
    private ItemType type;
    private String itemId;
    private int quantity;
    private CafeVasItemDto itemDetails;
    private Double grossPrice;
    private DiscountType discountType;
    private Double discount;
    private Double netPrice;
    //netprice * quantity
    private Double amount;
    private Double cgst;
    private Double igst;
    private Double sgst;
    private Double totalAmount;


}
