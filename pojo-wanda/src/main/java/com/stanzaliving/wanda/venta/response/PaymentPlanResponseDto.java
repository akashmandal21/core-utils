package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanResponseDto {
    private List<InstallmentResponseDto> paymentPlan;
    private String installmentTypeStr;
    private InstallmentTypeEnum installmentType;
    private Boolean isSelected;
    private String view;
}
