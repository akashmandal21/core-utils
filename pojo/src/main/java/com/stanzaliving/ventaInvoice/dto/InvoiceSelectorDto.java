package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvoiceSelectorDto {
    private String categoryName;
    private String stanzaDocumentId;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double totalAmount;
    private String uuid;
    private Double totalCreditNoteAmount;
}
