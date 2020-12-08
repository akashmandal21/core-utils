package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.enums.GSTSlabs;
import com.stanzaliving.core.generic.itemmaster.enums.ItemType;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PoItemDetail {

    private Department itemDept;
    private String itemUuid;
    private String code;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private UIKeyValue costHead;
    private ItemType itemType;
    private String name;
    private GSTSlabs slab;
    private UnitType uom;
    private String hsnSacCode;
    private String description;
    private BigDecimal quantity;
    private BigDecimal unitRate;
    private BigDecimal gst;

}
