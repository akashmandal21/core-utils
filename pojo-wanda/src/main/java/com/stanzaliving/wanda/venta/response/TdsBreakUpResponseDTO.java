package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TdsBreakUpResponseDTO {
    private double earningAmount;
    private double netPayout;
    private Double tds;
    private Double tdsOnEarningAmount;
    private Double firstAmount;
    private Double tdsOnFirstAmount;
    private Double remainingTdsOnFirstAmount;
}
