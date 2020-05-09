package com.stanzaliving.boq_service;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoqItemSearchRequestDto {

    private ItemType itemType;
    private String itemSpec;
    private String particular;
    private String itemCode;
    private String categoryUuid;

}
