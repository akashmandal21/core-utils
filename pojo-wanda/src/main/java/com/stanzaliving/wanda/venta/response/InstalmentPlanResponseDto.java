package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;

import lombok.Getter;

@Getter
public class InstalmentPlanResponseDto {
    private String name;
    private InstallmentTypeEnum instalmentTypeEnum;
    private Double upFrontPaymentMonth;
}