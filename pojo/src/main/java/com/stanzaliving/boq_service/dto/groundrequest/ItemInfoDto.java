package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.item_master.enums.AcquisitionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemInfoDto {
    private String itemName;

    private String itemCode;

    private AcquisitionType acquisitionType;

    private String itemDescription;

    private String length;

    private String breadth;

    private String height;
}
