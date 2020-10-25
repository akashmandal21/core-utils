package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GenericItemDto {

    private Department department;
    private UIKeyValue costHead;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private String itemUuid;
    private String itemCode;
    private String itemName;
    private String itemDescription;
    private UIKeyValue itemType;
    private UIKeyValue uom;

}
