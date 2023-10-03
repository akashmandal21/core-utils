package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum ContractStatus {
    MERGED("Merged"), DRAFT("Draft"), PENDING_APPROVAL("Pending Approval"), APPROVED("Approved"), REJECTED("Rejected"), EXPIRED("Expired"),APPROVED_DEAL_UPDATION_WIP("Approved Deal Updation WIP"),UPDATED_DEAL_PENDING_APPROVAL("Updated deal - pending approval"), SERVICE_MIX_PENDING_APPROVAL("Updated deal - service mix pending approval"), SERVICE_MIX_APPROVED("Updated deal - service mix approved");

    String statusMsg;
}

