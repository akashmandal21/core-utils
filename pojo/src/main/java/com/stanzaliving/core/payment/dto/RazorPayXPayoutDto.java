package com.stanzaliving.core.payment.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RazorPayXPayoutDto {
    String payoutId;

    String requestUniqueId;
}