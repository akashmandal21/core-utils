package com.stanzaliving.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InvoiceMigrationDto {

    private InvoiceBasicDetailsDto invoiceBasicDetailsDto;

    private InvoiceFeeDto invoiceFeeDto;

    private List<InvoiceItemDetailsDto> invoiceItemDetailsDtoList;

    private List<InvoicePaymentDetailsDto> invoicePaymentDetailsDtos;

}
