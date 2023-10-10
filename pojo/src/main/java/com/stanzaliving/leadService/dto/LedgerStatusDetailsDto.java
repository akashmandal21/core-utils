package com.stanzaliving.leadService.dto;

import com.stanzaliving.ledger.enums.SettleLedgerActionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LedgerStatusDetailsDto {
    private String currentBookingUuid;

    private Double amount;

    private Double processedAmount;

    public String transactionUuid;

    private SettleLedgerActionStatus settleLedgerActionStatus;

    private String rejectedReason;

}
