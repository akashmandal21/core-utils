package com.stanzaliving.price_strategy.request;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class SecurityDepositDto {
    private Boolean fixedAmount;
    private Double fixedAmountValue;
    //private Boolean multiplierOfMonthlyRent;
    private Double multiplierOfMonthlyRentValue;
}
