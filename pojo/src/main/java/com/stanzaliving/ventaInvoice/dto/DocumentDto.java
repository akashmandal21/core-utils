package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.InvoiceType;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class DocumentDto {

    private InvoiceType type;
    private LocalDate fromDate;
    private LocalDate toDate;
    private LocalDate issueDate;
    private Double amount;
    private String categoryName;
    private String subCategoryName;
    private ReferenceType referenceType;
    private String serviceType;
    private String remarks;
    private String filePath;
    private String fileName;
    private String parentId;
    private String stanzaDocumentId;
    private float cgstAmount;
    private float sgstAmount;
    private float igstAmount;
    private Double lineAmount;
    private Double invoiceAmount;
    private List<CreditAttributionDto> creditAttribution;
    private String billToName;
    private String residenceAddress;
    private String stayDetails;
}