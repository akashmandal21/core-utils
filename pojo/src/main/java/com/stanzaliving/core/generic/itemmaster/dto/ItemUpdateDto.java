package com.stanzaliving.core.generic.itemmaster.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.enums.GSTSlabs;
import com.stanzaliving.core.generic.itemmaster.enums.ItemAction;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ItemUpdateDto extends AbstractDto {

    private Department department;
    private ItemAction itemAction;

    private UIKeyValue itemCategory;
    private UIKeyValue itemSubCategory;
    private UIKeyValue itemCostHead;

    private String itemName;
    private String itemDescription;
    private String itemCode;
    private GSTSlabs gstSlab;
    private List<UIKeyValue> usageTypeOrArea;
    private UnitType unitOfMeasurement;
    private String recipeTag;
    private Boolean taggable;
}
