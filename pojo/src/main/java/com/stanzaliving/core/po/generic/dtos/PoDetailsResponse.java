package com.stanzaliving.core.po.generic.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.invoice.dto.OtherFeeRowDto;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import com.stanzaliving.core.vendor.enums.VendorType;
import com.stanzaliving.po.enums.DeliveryType;
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
    private String poExpenseType;
    private String poBoqLabel;

    private GenericPOType potype;
    private GenericPOTOStatus postatus;
    private Department department;
    private BigDecimal otherFeeSubTotal;
    private BigDecimal otherFeeGst;
    private BigDecimal otherFeeTotal;
    private BigDecimal poAmount;
    private BigDecimal poSubtotal;
    private BigDecimal poItemSubtotal;

    @Builder.Default
    private BigDecimal refundableAmount=BigDecimal.ZERO;
    private BigDecimal poGst;
    private String vendorUuid;
    private VendorType vendorType;

    private String propertUuid;
    private LocalDate startDate;
    private LocalDate endDate;
    private String scopeOfWork;
    private boolean isPo;
    private boolean isAdvanceIncludingTax;
    private String sourceLocation;
    private LocationType sourceLocationType;
    private String sourceLocationUuid;
    private String vendorName;
    private LocationType deliveryLocationType;
    private UIKeyValue deliveryLocation;
    private BigDecimal advanceAmount;
    private BigDecimal retentionAmount;
    private String retentionPercent;

    private Integer advCreditDays;
    private Integer genCreditDays;
    private Integer retCreditDays;

    private List<PoItemDetail> poItemDetails;
    private List<OtherFeeRowDto> otherFeeDtos;
    private String poTypeText;
    private Long startDateMilis;
    private Long endDateMilis;

    private boolean isAdvanceInPct;
    private BigDecimal advanceTypeValue;

    private String poDownloadUrl;
    private String poCreatedBy;

    private LocationType costCenterLocationType;
    private UIKeyValue costCenterLocationName;

    private String taxLocationType;

    private String billingState;
    private String deliveryType;

}
