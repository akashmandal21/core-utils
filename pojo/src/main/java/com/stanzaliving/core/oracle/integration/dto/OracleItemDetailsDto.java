package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OracleItemDetailsDto {

    private String item;
    private boolean receive;
    private BigDecimal quantity=BigDecimal.ZERO;
    private BigDecimal quantityReceived=BigDecimal.ZERO;
    private BigDecimal quantityReturned=BigDecimal.ZERO;
    private String returnReason;
    private BigDecimal quantityInstalled=BigDecimal.ZERO;
    private BigDecimal quantityRejected=BigDecimal.ZERO;
    private String rejectionReason;
}
