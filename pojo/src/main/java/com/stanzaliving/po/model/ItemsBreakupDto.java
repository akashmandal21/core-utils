package com.stanzaliving.po.model;


import lombok.*;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ItemsBreakupDto {
    private String itemUuid;
    private BigDecimal existingQty;
    private BigDecimal updatedQty;
}
