package com.stanzaliving.core.cafe.order.dto;


import com.stanzaliving.core.cafe.order.constants.ItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasCafeOrderItemPDto {
    private ItemType type;
    private String itemId;
    private Integer quantity;
    private Integer orderedQuantity;
    private Double amount;
    private Double cgst;
    private Double sgst;
    private Double igst;
    private Double gstAmount;
    private Double totalAmount;
}
