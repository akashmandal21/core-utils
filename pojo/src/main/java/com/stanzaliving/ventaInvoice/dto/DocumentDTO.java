package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.DocumentType;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class DocumentDTO {

    private String documentId;
    private DocumentType type;
    private LocalDate fromDate;
    private LocalDate toDate;
    private LocalDate issueDate;
    private Double amount;
    private String categoryId;
    private ReferenceType referenceType;
    private String billFrom;
    private String billToId;
    private String serviceType;
    private String remarks;
    private String referenceId;
    private String contractId;
    private String fileLocation;
    private String filePath;
    private String fileName;
    private LocalDate ledgerTimeStamp;
    private String cityId;
    private String microMarketId;
    private String residentId;
    private String parentId;
    private String stanzaDocumentId;

}