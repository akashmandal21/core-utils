package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.item_master.enums.AcquisitionType;
import com.stanzaliving.item_master.enums.ItemType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import com.stanzaliving.transformations.enums.UnitType;
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

    private AcquisitionType acquisitionType;

    private BigDecimal quantity;

    private UnitType orderUnit;

    private AreaOfUse areaOfUse;

    private String imageURL;

    private String subCategory;
}
