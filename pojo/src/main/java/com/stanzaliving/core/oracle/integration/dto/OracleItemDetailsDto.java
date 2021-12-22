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
    @Builder.Default
    private BigDecimal quantity=BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal quantityReceived=BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal quantityReturned=BigDecimal.ZERO;
    private String returnReason;
    @Builder.Default
    private BigDecimal quantityInstalled=BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal quantityRejected=BigDecimal.ZERO;
    private String rejectionReason;
}
