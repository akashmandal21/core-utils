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
public class CafeOrderItemRDto {
    private ItemType type;
    private String subType;
    private String itemId;
    private boolean featured;
    private boolean mandatory;

    private CafeVasItemDto itemDetails;

    private Double grossPrice;
    private DiscountType discountType;
    private Double discount;
    private Double netPrice;
    private Double cgstPercentage;
    private Double igstPercentage;
    private Double sgstPercentage;
    private Double cgst;
    private Double igst;
    private Double sgst;
    private Double marginPercentage;

}
