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
    private boolean disableOnCafe;
}
