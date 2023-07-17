package com.stanzaliving.core.payment.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RazorPayXDto {
    List<RazorPayXPayoutDto> payoutIds;

    boolean isRefund;
}
