package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.item_master.enums.AcquisitionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.io.ByteArrayResource;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {
    private String itemUuid;

    private String itemCode;

    private String itemType;

    private String itemName;

    private AcquisitionType acquisitionType;

    private BigDecimal quantity;

    private String orderUnit;

    private String areaOfUse;

    private byte[] imageUrl;

    private String subCategory;
}
