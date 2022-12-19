package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.tuple.Pair;

import java.math.BigDecimal;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemSectionDto {

    private String itemCode;

    private String itemName;

    @Builder.Default
    private BigDecimal itemQuantity = BigDecimal.ZERO;

    private BigDecimal itemCost;

    private BigDecimal grnQuantity;

    @Builder.Default
    private BigDecimal qcQuantity = BigDecimal.ZERO;

    private BigDecimal totalItemQuantity;

    private ItemType itemType;

    @Builder.Default
    private BigDecimal masterRate = BigDecimal.ZERO;

    private AreaOfUse areaOfUse;

    private String subCategory;

    private Map<String, Pair<String, BigDecimal>> itemCodeAndSectionNameAndItemQuantityMap;

    private Map<String, Pair<String, BigDecimal>> itemCodeAndSectionNameAndQcQuantityMap;
}
