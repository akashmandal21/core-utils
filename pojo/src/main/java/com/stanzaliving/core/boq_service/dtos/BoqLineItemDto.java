package com.stanzaliving.core.boq_service.dtos;

import com.stanzaliving.boq_service.dto.LabelValueDto;
import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import com.stanzaliving.transformations.enums.AreaOfUse;
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

    //new keys; will replace old keys with time
    private List<LabelValueDto<AreaOfUse>> areaOfUseOptions;
    private LabelValueDto<AreaOfUse> areaOfUseValue;
    private BigDecimal itemAmount;
    private LabelValueDto<BoqItemProvider> budgetByValue;
    private LabelValueDto<BoqItemProvider> doneByValue;

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
    private BigDecimal masterRate;
    private LineItemStatus lineItemStatus;
    private boolean itemApproved;
    private BigDecimal maxQuantity;
    private String boqLabel;

    @Override
    public int compareTo(BoqLineItemDto o) {
        return this.getItemCode().compareTo(o.getItemCode());
    }
}
