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
    private int quantity;
    private int orderedQuantity;
    private double amount;
    private double cgst;
    private double sgst;
    private double igst;
    private double gstAmount;
    private double totalAmount;
}
