package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.dto.request.PaymentPlanRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanResponseDtoCustomAlfred {

    private PaymentPlanRequestDto paymentPlanRequestDto;

    private PaymentPlanResponseDto paymentPlanResponseDto;

}
