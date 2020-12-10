package com.stanzaliving.core.inventory.dto;

import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class InventoryItemDetailedDto {
    @EqualsAndHashCode.Include
    private String itemUuid;
    private String error;

    private UIKeyValue costHead;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private UIKeyValue itemType;
    private String itemCode;
    private String itemName;
    private String itemDesc;
    private UnitType uom;
    private String uomText;
    private String hsnSacCode;
    private UIKeyValue gstSlabs;
    private Double gstPct;

    private BigDecimal currentToQuantity;
    private BigDecimal currentItemAmount;
    private BigDecimal quantity;
    private BigDecimal effectivePrice;
    private BigDecimal itemAmount;
    private BigDecimal openingQuantity;
    private BigDecimal blockedQuantity;
    private BigDecimal availableQuantity;

}
