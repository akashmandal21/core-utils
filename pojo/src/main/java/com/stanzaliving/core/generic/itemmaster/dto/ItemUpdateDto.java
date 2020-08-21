package com.stanzaliving.core.generic.itemmaster.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.generic.itemmaster.enums.ItemAction;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ItemUpdateDto extends AbstractDto {

    private Department department;
    private ItemAction itemAction;

    private String itemName;
    private String itemDescription;
    private UIKeyValue usageTypeOrArea;
    private UnitType unitOfMeasurement;
}