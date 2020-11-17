package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.DiscountType;
import com.stanzaliving.core.cafe.order.constants.ItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderItemPDto {
    @NotNull(message = "Empty Item Type")
    private ItemType type;
    @NotBlank(message = "Empty Item Id")
    private String itemId;
    private String grammage;
    @Min(value = 1, message = "Atleast One Quantity is Required")
    private int quantity;

    private Double grossPrice;
    private DiscountType discountType;
    private Double discount;
    @NotNull(message = "Empty Price")
    @Min(value = 0, message = "Price should be positive")
    private double netPrice;

    private Double cgstPercentage;
    private Double igstPercentage;
    private Double sgstPercentage;
    private Double marginPercentage;

    //netprice * quantity
    private Double amount;

    private Double cgst;
    private Double igst;
    private Double sgst;

    private Double totalAmount;


}
