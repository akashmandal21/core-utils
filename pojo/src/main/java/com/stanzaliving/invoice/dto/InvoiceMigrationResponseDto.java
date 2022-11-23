package com.stanzaliving.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceMigrationResponseDto {

    private PoInvoiceDetailsDto poInvoiceDetailsDto;

    private List<InvoiceMigrationDto> invoiceMigrationDtos;

}
