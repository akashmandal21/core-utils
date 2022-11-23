package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum DeliveryType {

    SOURCE("Source"),
    DESTINATION("Destination"),
    BILLING("Billing");

    private String deliveryTypeName;

}
