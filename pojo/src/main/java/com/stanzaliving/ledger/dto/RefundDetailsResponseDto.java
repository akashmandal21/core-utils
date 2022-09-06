package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.SettleLedgerActionStatus;
import com.stanzaliving.ledger.enums.SettleLedgerActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundDetailsResponseDto {

    private double refundAmount;

    private Boolean notifyCustomer;

    private double totalAmount;

    private SettleLedgerActionType settleLedgerActionType;

    private SettleLedgerActionStatus settleLedgerActionStatus;

    private String bookingUuid;

    private String rejectedReason;

    private String utr;

}
