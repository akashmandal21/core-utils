package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemsMapped {

    private String itemUuid;
    private String itemCode;
    private String itemName;
    private String itemUom;
    private String brandName;

}
