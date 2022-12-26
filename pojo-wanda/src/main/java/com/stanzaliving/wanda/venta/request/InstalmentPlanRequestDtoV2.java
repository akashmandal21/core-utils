package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.booking.dto.request.DiscountRequestDto;
import com.stanzaliving.booking.enums.PaymentTerm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstalmentPlanRequestDtoV2 {
    private PaymentTerm instalmentTypeEnum;
    private String bookingUuid;
    private DiscountRequestDto discount;
    @Builder.Default
    private Double upsell=0d;
    @Builder.Default
    private Double bumpUpPrice=0d;
}