package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstalmentPlanResponseDto {
	private String name;
	private InstallmentTypeEnum instalmentTypeEnum;
	private Double upfrontPaymentMonth;

}