package com.stanzaliving.ledger.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CashReconLineItemResponseDTO {

    private Date date;

    private String formattedDate;

    private String title;

    private String subTitle;

    private String transactionType;

    private Double amount;

    private Double balance;

    private String transactionColorCode;

    private String transactionStatus;

    public interface TRANSACTION_TYPE_COLOR {
        String CREDIT_COLOR = "#F55F71";
        String DEBIT_COLOR = "#60C3AD";
        String PENDING_APPROVAL = "#FFB701";
    }

}


