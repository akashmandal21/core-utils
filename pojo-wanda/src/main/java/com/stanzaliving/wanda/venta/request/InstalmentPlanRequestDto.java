package com.stanzaliving.wanda.venta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstalmentPlanRequestDto {
    private String instalmentTypeEnum;
    private String bookingUuid;
    private String discountCode;
    private Double discountAmount;
}