package com.stanzaliving.ventaInvoice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ResponseDocumentDto {
    private LocalDate issueDate;
    private String stanzaDocumentId;
    private String invoiceType;
    private String categoryName;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double totalAmount;
    private String billToName;
    private String referenceId;
    private String residenceName;
    private String invoiceUuid;
    private String type;

}
