package com.stanzaliving.ledger.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllLedgerResponseDTO {

    private String referenceId;

    private String referenceType;

    private double securityLedgerBalance;

    private double advanceRentalLedgerBalance;

    private double residentLedgerBalance;

    private List<LedgerCustomResponseDTO> entries;
}
