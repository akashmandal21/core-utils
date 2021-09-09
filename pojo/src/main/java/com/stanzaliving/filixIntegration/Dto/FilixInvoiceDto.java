package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.filixIntegration.LocalDateAttributeConverter;
import com.stanzaliving.ventaInvoice.enums.ReferenceType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilixInvoiceDto {
    private String stanzaDocumentId;

    private String invoiceType;

    private String categoryUuid;

    private String subCategoryUuid;

    private String contractId;

    private String parentUuid;

    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate fromDate;

    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate toDate;

    @Convert(converter = LocalDateAttributeConverter.class)
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

    private Long id;

    private String uuid;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private boolean status = true;
}
