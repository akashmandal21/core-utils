package com.stanzaliving.boq_service.dto.groundrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AreaWiseBreakupDto {
    private String areaOfUse;

    private BigDecimal quantity;

    private BigDecimal percentage;
}
