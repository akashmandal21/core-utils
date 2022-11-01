package com.stanzaliving.ledger.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefundStatusUpdateDto {
    private String payoutId;

    private String payoutStatus;

    private String reason;
}
