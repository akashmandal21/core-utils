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
    private CafeVasItemDto itemDetails;
    private Double grossPrice;
    private DiscountType discountType;
    private Double discount;
    private Double netPrice;
    //netprice * quantity
    private int orderedQuantity;
    private Double orderedAmount;
    private Double orderedCgst;
    private Double orderedIgst;
    private Double orderedSgst;
    private Double orderedTotalAmount;

    private int finalQuantity;
    private Double finalAmount;
    private Double finalCgst;
    private Double finalIgst;
    private Double finalSgst;
    private Double finalTotalAmount;

    private boolean refunded;
    private String refundReason;
    private String refundRemarks;


}
