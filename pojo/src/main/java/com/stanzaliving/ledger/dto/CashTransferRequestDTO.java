package com.stanzaliving.ledger.dto;

import com.stanzaliving.ledger.enums.CashReceiver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashTransferRequestDTO {

    @NotNull(message = "amount cannot be null")
    private double amount;

    @NotNull(message = "transferredBy cannot be null")
    private CashReceiver depositor;

    @NotNull(message = "cashReceiver cannot be null")
    private CashReceiver cashReceiver;

    @NotNull(message = "transferredByUuid cannot be null")
    private String depositorUuid;

    private String cashReceiverUuid;

    @NotNull(message = "transfer Date cannot be null")
    private Date transferDate;

    private String ifscCode;

    private String imageUrl;

    private String cityUuid;

}
