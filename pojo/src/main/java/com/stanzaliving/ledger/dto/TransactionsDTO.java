package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.annotation.constraint.NotZeroOrNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionsDTO {

    @NotBlank(message = "referenceId can not be empty")
    private String referenceId;

    @NotBlank(message = "referenceType can not be empty")
    private String referenceType;

    @NotBlank(message = "ledgerType can not be empty")
    private String ledgerType;

    @NotNull(message = "unit can not be empty")
    private Double unit;

    @NotZeroOrNull(message = "Amount cannot be zero or null")
    private Double amount;

    @NotBlank(message = "type can not be empty")
    private String transactionType;

    @NotBlank(message = "description can not be empty")
    private String description;

    private Map<String, Object> metadata;

}
