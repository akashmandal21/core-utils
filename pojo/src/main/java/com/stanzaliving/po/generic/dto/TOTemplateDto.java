package com.stanzaliving.po.generic.dto;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.leadership.dto.DateRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class TOTemplateDto {

    private String toUuid;

    private UIKeyValue toType;

    private UIKeyValue toExpenseType;

    private UIKeyValue toBoqLabel;

    private UIKeyValue foodCostType;

    private DateRange toDuration;

    private String toDescription;

    private UIKeyValue sourceLocationType;

    private UIKeyValue sourceLocation;

    private UIKeyValue destinationLocationType;

    private UIKeyValue destinationLocation;

    private DeliveryAddress sourceAddress;

    private DeliveryAddress destinationAddress;

    private POItemUiDto toItems;

    private BigDecimal totalNoOfItems;

    private BigDecimal totalTOAmount;

    private String otherRemarks;

    private String actionReason;

    private String actionDocUrl;

    private BigDecimal currentTotalNoOfItems;

    private BigDecimal currentTotalToAmount;

    private Department department;

    private String sourceAddressUuid;

    private String destinationAddressUuid;

    private String adjustCloseId;

    private String doneBy;

}
