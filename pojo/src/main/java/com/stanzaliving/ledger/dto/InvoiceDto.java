package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {

    private String referenceUuid;
    private String referenceType;
    private String subCategoryName;
    private Double totalAmount;
    private InvoiceType invoiceType; //invoice generate -> credit, credit note -> debit
    private String stanzaDocumentId;
    private String metadata;

}
