package com.stanzaliving.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CsvInvoiceItemDto {

    private String itemUuid;
    private BigDecimal itemTotal;
}
