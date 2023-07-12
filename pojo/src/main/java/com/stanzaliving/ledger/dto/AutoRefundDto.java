package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.SettleLedgerActionType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoRefundDto {

    private String currentBookingUuid;

    private double amount;

    private String carryForwardBookingUuid;

    private boolean isNotifyCustomer;

    private double processedAmount;

    private SettleLedgerActionType settleLedgerActionType;

    private String createdBy;

}
