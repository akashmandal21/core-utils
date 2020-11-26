package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeItemPriceDto {
    private String itemId;
    private Double finalPrice;
    private Double gstPercentage;
    private Double price;
    private Double marginPercentage;
    private Double gst;
    private boolean disableOnCafe;
}
