package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.core.vendor.enums.VendorType;
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
    private String poNumber;
    private GenericPOType potype;
    private GenericPOTOStatus postatus;
    private Department department;
    private BigDecimal otherFeeSubTotal;
    private BigDecimal otherFeeGst;
    private BigDecimal poAmount;
    private String vendorUuid;
    private VendorType vendorType;

    private String propertUuid;
    private LocalDate startDate;
    private LocalDate endDate;
    private String scopeOfWork;
    private boolean isPo;
    private String sourceLocation;
    private LocationType sourceLocationType;
    private String sourceLocationUuid;
    private String vendorName;
    private LocationType deliveryLocationType;
    private UIKeyValue deliveryLocation;
    private BigDecimal advanceAmount;

    private Integer advCreditDays;
    private Integer genCreditDays;
    private Integer retCreditDays;

    List<PoItemDetail> poItemDetails;
}
