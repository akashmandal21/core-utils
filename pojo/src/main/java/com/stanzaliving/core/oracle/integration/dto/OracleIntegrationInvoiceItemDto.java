package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class OracleIntegrationInvoiceItemDto {

    private String item;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal actualRate;
    private BigDecimal rentPeriod;
    private BigDecimal amount;
    private String stanzaLineId;
    private String hsnCode;
    private String indiaTaxNature;
    private String taxLocationType;
    private double taxRate;
}
