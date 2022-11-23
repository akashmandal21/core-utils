package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.SettleLedgerActionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SettleLedgerStatusUpdateDto {

    private String bookingUuid;

    private SettleLedgerActionStatus settleLedgerActionStatus;
}
