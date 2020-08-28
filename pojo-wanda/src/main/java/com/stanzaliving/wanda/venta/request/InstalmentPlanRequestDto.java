package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class InstalmentPlanRequestDto {
    private InstallmentTypeEnum instalmentTypeEnum;
    private String bookingUuid;
    private String discountCode;
    private Double discountAmount;
}