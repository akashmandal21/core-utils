package com.stanzaliving.invoice.enums.dto;

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

    private UIKeyValue costHead;

    private UIKeyValue category;

    private UIKeyValue subCategory;

    private BigDecimal poQuantity;

    private BigDecimal poUnitRate;

    private UIKeyValue poGst;

    private BigDecimal gsriQuantity;

    private BigDecimal invoiceQuantity;

    private BigDecimal invoiceUnitRate;

    private UIKeyValue invoiceGst;

    private BigDecimal invoiceItemTotal;

    private BigDecimal advanceAdjustment;

}
