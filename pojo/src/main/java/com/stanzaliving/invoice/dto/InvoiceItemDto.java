package com.stanzaliving.invoice.dto;

import com.stanzaliving.boq_service.enums.BoqLabel;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceItemDto {

    private String itemUuid;

    private String itemCode;

    private String itemName;

    private String itemDescription;

    private String uom;

    private UIKeyValue costHead;

    private UIKeyValue category;

    private UIKeyValue subCategory;

    private boolean exceedEligible;

    private BigDecimal poQuantity;

    private BigDecimal poUnitRate;
    private BigDecimal rentPeriod;
    private BigDecimal poRentPeriod;

    private UIKeyValue poGst;

    private BigDecimal gsriQuantity;

    private BigDecimal maxInvoiceQuantity;

    private BigDecimal invoiceQuantity;

    private BigDecimal invoiceUnitRate;

    private UIKeyValue invoiceGst;

    private BigDecimal invoiceItemTotal;

    private BigDecimal advanceAdjustment;

    private BigDecimal otherFee;
    private BigDecimal wtdAvg;
    private BigDecimal totalOtherFee;
    @Builder.Default
    private BoqLabel boqLabel = BoqLabel.NA;
}
