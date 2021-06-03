package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String stanzaDocumentId;
}
