package com.stanzaliving.invoice.dto;

import com.stanzaliving.invoice.enums.InvoiceStatus;
import com.stanzaliving.invoice.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class POCsvInvoiceDto {

    private String vendorInvoiceRef;

    private InvoiceType invoiceType;

    private InvoiceStatus invoiceStatus;

    private String invoiceCode;

    private Date invoiceCreatedAt;

    private String invoiceUuid;

    private Map<String, BigDecimal> itemUuidItemTotalMap;
}
