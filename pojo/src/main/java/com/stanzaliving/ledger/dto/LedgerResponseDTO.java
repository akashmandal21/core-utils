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
public class LedgerResponseDTO {
    private String referenceId;

    private String referenceType;

    private String ledgerType;

    private List<LedgerCustomResponseDTO> entries;
}
