package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LedgerCustomResponseDTO {

    private TransactionType transactionType;

    private double amount;

    private double balance;

    private String metaData;

    private Date createdDate;

    private String ledgerType;
}
