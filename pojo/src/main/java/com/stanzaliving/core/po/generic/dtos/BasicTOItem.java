package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BasicTOItem {

    private String itemUuid;

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

    private BigDecimal quantity;

    private BigDecimal effectivePrice;

    private BigDecimal itemAmount;

    private BigDecimal openingQuantity;

    private BigDecimal blockedQuantity;

    private BigDecimal availableQuantity;

}
