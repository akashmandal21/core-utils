package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyBreakupResponseDto implements Serializable {
    private String refundableDeposit;
    private String packagedServiceFees;
    private String foodServiceFees;
    private String gst;
    private String total;
    private String cityBuffer;
    private String basePrice;
    private String underWrittenPrice;
    private String feesPerMonth;
    private Double upsoldPercent;
    private String upsoldPercentDescription;
}
