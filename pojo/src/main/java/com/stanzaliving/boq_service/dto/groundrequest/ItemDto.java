package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {
    private String itemUuid;

    private String itemCode;

    private ItemType itemType;

    private String itemName;

    private String acquisitionType;

    private BigDecimal quantity;

    private String orderUnit;

    private String imageURL;
}
