package com.stanzaliving.price_strategy.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum WaiveOffType {
    ADVANCE_RENTAL("Advance Rental"),
    UPFRONT("Upfront");

    private String name;
}
