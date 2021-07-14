package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceSearchIndexDto extends AbstractSearchIndexDto {

    private LocalDate issueDate;

    private String stanzaDocumentId;

    private String invoiceType;

    private String categoryName;

    private String subCategory;

    private java.time.LocalDate fromDate;

    private LocalDate toDate;

    private Double amount;

    private String billToName;

    private String studentId;

    private String residenceName;

    private String residentId;

    private String micromarketName;

    private String cityName;

    private String generationSource;
    private String ledgerTimestamp;
    private String parentId;
    private String remark;
    private String rentLedgerNarration;
    private String stateCode;
    private String fileName;
    private String filePath;

    private String residenceMicromarketUuid;
    private String residenceCityUuid;
    private String residenceUuid;
}
