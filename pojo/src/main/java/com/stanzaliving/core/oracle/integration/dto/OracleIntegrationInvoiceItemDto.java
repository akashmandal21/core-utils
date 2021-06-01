package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class OracleIntegrationInvoiceItemDto {

    private String item;
    private int quantity;
    private double rate;
    private String stanzaLineId;
}
