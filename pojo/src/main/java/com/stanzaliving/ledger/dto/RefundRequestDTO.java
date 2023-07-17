package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.SettleLedgerActionType;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundRequestDTO {

    private SettleLedgerActionType settleLedgerActionType;

    @NotNull(message = "booking uuid can't be empty")
    private String bookingUuid;

    @NotNull(message = "Amount to be processed can't be empty")
    @Min(value = 1L,message = "Amount to be processed can't be 0")
    private double amount;

    @NotNull(message = "Processed amount can't be empty")
    @Min(value = 1L,message = "Processed amount can't be 0")
    private double processedAmount;

    private boolean isNotifyCustomer ;

    private String rejectedReason;

    private String refundApprovalType;

    private String approvedBy;

    private Boolean approvalRequired;

    private String userUuid;

    private String requestUniqueUuid;
}
