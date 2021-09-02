package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixInvoiceDto {
    private String stanzaDocumentId;

    private String invoiceType;

    private String categoryUuid;

    private String subCategoryUuid;

    private String contractId;

    private String parentUuid;

    private LocalDate fromDate;

    private LocalDate toDate;

    private LocalDate issueDate;

    private Double totalAmount;

    private ReferenceType referenceType;

    private String serviceType;

    private String remarks;

    private String generationSource;

    private String residentId;

    private String residentUuid;

    private String referenceUuid;

    private String stateCode;

    private String stateUuid;

    private String residenceCityUuid;

    private String filePath;

    private String fileName;

    private String billFromUuid;

    private String billToUuid;

    private String rentLedgerNarration;

    private String dealName;

    private String dealType;

    private Long inventoryInvoiceId;

    private String metaDataCallerService;
}
