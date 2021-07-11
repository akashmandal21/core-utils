package com.stanzaliving.core.dto;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BrandSkuItemDetailDto {

    private String itemUuid;
    private String itemName;
    private String itemCode;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private String brand;
    private UIKeyValue uom;
    private int approvalLevel;
    private boolean approved;
    private boolean canApprove;

}
