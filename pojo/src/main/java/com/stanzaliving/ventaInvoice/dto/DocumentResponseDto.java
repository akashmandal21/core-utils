package com.stanzaliving.ventaInvoice.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
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
public class DocumentResponseDto {
    private String uuid;
    private Long id;
    private String stateCode;
    private String rentLedgerNarration;
    private InvoiceType invoiceType;
    private LocalDate fromDate;
    private LocalDate toDate;
    private LocalDate issueDate;
    private Double totalAmount;
    private String referenceUuid;
    private CategoryDto category;
    private SubCategoryDto subCategory;
    private ReferenceType referenceType;
    private String serviceType;
    private String remarks;
    private String filePath;
    private String fileName;
    private String parentUuid;
    private String parentStanzaDocumentId;
    private String stanzaDocumentId;
    private List<DocumentLineItemDto> documentLineItemDto;
    private Double invoiceAmount;
    private List<CreditAttributionDto> creditAttribution;
    private ResidenceDto residence;
    private String contractId;
    private BillToDto billTo;
    private BillFromDto billFrom;
    private String residentId;
    private String dealName;
    private String dealType;
    private String dealPostalCode;
    private List<String> dealResidences;
    private String metaDataCallerService;
    private String generationSource;
    private String issuedBy;
}