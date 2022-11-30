package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SectionalBoqItemDetailsDto {
    
    private String itemCode;
    
    private String itemName;

    @Builder.Default
    private BigDecimal itemQuantity = BigDecimal.ZERO;

    private ItemType itemType;

    @Builder.Default
    private BigDecimal qcQuantity = BigDecimal.ZERO;

    @Builder.Default
    private BigDecimal masterRate = BigDecimal.ZERO;

    private AreaOfUse areaOfUse;

    private String subCategory;
}
