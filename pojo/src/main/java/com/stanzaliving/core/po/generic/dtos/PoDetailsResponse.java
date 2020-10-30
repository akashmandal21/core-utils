package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.transformations.enums.LocationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PoDetailsResponse {

    private String poUuid;
    private GenericPOType potype;
    private GenericPOTOStatus postatus;
    private BigDecimal otherFeeSubTotal;
    private BigDecimal otherFeeGst;
    private BigDecimal poAmount;
    private String vendorUuid;
    private String propertUuid;
    private LocalDate startDate;
    private LocalDate endDate;
    private String scopeOfWork;
    private String vendorName;
    private LocationType deliveryLocationType;
    private UIKeyValue deliveryLocation;

    List<PoItemDetail> poItemDetails;
}
