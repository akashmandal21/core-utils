package com.stanzaliving.ledger.dto;


import com.stanzaliving.booking.dto.response.NewLedgerLineItemResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashReconResponseDTO {


    private double arrears;

    private double cashReceived;

    private double cashTransferred;

    private double balance;

    private List<CashReconLineItemResponseDTO> ledgerLineItems;

    private List<CashReconLineItemResponseDTO> pendingApprovalLedgerLineItems;

    private String awaitingApprovalMessage;
}
