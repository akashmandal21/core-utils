package com.stanzaliving.core.generic.itemmaster.dto;

import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemDto {

    private String itemUuid;
    private String itemName;
    private String itemCode;
    private String costHead;
    private String category;
    private String subCategory;
    private String itemDescription;
    private String uom;
    private Date lastUpdateAt;
    private String lastUpdateBy;
    private Boolean itemInactive;
}
