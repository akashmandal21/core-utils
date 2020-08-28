package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
public class InstalmentPlanRequestDto {
    private InstallmentTypeEnum instalmentTypeEnum;
    private String bookingUuid;
    private String discountCode;
    private Double discountAmount;
}