package com.stanzaliving.invoice.dto;

import com.stanzaliving.core.generic.enums.GSTSlabs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceItemDetailsDto {

    private String invoiceUuid;

    private String itemUuid;

    private BigDecimal quantity;

    private BigDecimal unitRate;

    private GSTSlabs gstSlab;

    private Double gstPct;

    private BigDecimal itemTotal;

    private BigDecimal advanceAdjustmentAmt;

}
