package com.stanzaliving.core.boq_service.dtos;

import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import com.stanzaliving.transformations.enums.LineItemStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoqLineItemDto {
    private String itemUuid;
    private String lineItemUuid;
    private String particular;
    private String specifications;
    private String type;
    private String itemCode;
    private String unitType;
    private BoqItemProvider budgetBy;
    private BoqItemProvider doneBy;
    private Float slQty ;
    private Float llQty;
    private Float quantity;
    private String image;
    private String originalImageUrl;
    private String documentUrl;
    private String length;
    private String breadth;
    private String height;
    private String areaOfUse;
    private List<String> areaOfUseList;
    private String brandName;
    private String subBrandName;
    private Double rate;
    private LineItemStatus lineItemStatus;
}
