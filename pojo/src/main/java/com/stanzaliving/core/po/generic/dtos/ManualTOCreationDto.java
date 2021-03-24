package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.leadership.dto.DateRange;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ManualTOCreationDto {

    public Department department;

    public UIKeyValue toType;

    public DateRange toDuration;

    public String toDescription;

    public UIKeyValue foodCostType;

    public UIKeyValue sourceLocationType;

    public UIKeyValue sourceLocation;

    public UIKeyValue destinationLocationType;

    public UIKeyValue destinationLocation;

    public DeliveryAddressDto sourceAddress;

    public DeliveryAddressDto destinationAddress;

    public TOItemUIDto toItems;

    public BigDecimal totalNoOfItems;

    public BigDecimal totalTOAmount;

    public String otherRemarks;

    public String sourceAddressUuid;

    public String destinationAddressUuid;

}
