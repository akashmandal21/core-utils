package com.stanzaliving.invoice.dto;

import com.stanzaliving.invoice.enums.InvoiceStatus;
import com.stanzaliving.invoice.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceCsvResponseDto {

    private String vendorInvoiceRef;

    private InvoiceType invoiceType;

    private InvoiceStatus invoiceStatus;

    private String invoiceCode;

    private Date createdAt;

    private BigDecimal itemTotal;

    private String invoiceUuid;

    private String poUuid;

    private String itemUuid;

}
