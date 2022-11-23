package com.stanzaliving.core.inventory.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class InventorySummaryUpdate {

    private String cityUuid;
    private String addressUuid;
    private String itemUuid;
    private BigDecimal availStockQty;
    private BigDecimal availStockValue;
    private Date createdAt;
    private Date updatedAt;
    private String addressName;
    private Department itemDept;

}
