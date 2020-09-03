package com.stanzaliving.core.boq_service.dtos;

import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import com.stanzaliving.transformations.enums.LineItemStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoqLineItemDto implements Comparable<BoqLineItemDto>{
	
    private String itemUuid;
    private String lineItemUuid;
    private String categoryName;
    private String particular;
    private String specifications;
    private String type;
    private String itemCode;
    private String unitType;
    private BoqItemProvider budgetBy;
    private BoqItemProvider doneBy;
    private BigDecimal slQty ;
    private BigDecimal llQty;
    private BigDecimal quantity;
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
    private BigDecimal rate;
    private LineItemStatus lineItemStatus;
    private boolean itemApproved;

    @Override
    public int compareTo(BoqLineItemDto o) {
        return this.getItemCode().compareTo(o.getItemCode());
    }
}
