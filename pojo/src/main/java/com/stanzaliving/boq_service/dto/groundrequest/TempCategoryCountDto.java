package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.boq_service.dto.QuantityInfoDto;
import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TempCategoryCountDto {
    private ItemType itemType;

    private String itemUuid;

    private QuantityInfoDto quantityInfo;
}
