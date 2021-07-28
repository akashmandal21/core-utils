package com.stanzaliving.ledger.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthCheckCountDto {
    private int noOfTransactions;
    private String referenceId;
    private String ledgerType;
    private String message;
}
