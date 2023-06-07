package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.price_strategy.response.PaymentFrequencyDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentStrategyResponseDto {
    boolean isPriceStrategy;

    PaymentTerm paymentTerm;
    Double gstPercentage;
    List<PaymentFrequencyDto> paymentStrategies;
}
