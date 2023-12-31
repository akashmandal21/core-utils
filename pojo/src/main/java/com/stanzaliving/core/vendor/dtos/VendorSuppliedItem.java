package com.stanzaliving.core.vendor.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VendorSuppliedItem {
    private String itemUuid;
    private String itemCode;
    private BigDecimal cost;
    private boolean locationWiseRate;
}
