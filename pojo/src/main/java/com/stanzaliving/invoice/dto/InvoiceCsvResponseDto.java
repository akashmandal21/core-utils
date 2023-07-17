package com.stanzaliving.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceCsvResponseDto {

    private String poUuid;

    private List<POCsvInvoiceDto> csvInvoiceDtoList;

}
