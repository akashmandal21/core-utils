package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.InvoiceType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class InvoiceDTO {

    private String invoiceId;
    private InvoiceType type;
    private LocalDate fromDate;
    private LocalDate toDate;
    private LocalDate issueDate;
    private Double amount;
    private String referenceType;
    private String billFrom;
    private String billToId;
    private String serviceType;
    private String remarks;
    private String residentId;
    private String dealId;
    private String contractId;
    private String fileLocation;
    private LocalDate ledgerTimeStamp;

}
