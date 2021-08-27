package com.stanzaliving.boq_service.dto;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDetails {

    private LabelValueDto<String> itemUuid;
    private LabelValueDto<String> itemCode;
    private LabelValueDto<ItemType> itemType;
}
