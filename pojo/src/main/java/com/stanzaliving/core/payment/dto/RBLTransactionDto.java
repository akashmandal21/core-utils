package com.stanzaliving.core.payment.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RBLTransactionDto {
    private String serviceName;
    private String action;

    //@Valid
    @NotNull(message="Data is mandatory")
    @Valid
    private RBLDataDTO data;

    private String oldSystemBookingUUid;

    private boolean isInventoryTransaction;

}
