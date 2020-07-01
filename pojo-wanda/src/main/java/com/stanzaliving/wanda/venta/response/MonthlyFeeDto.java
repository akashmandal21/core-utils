package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyFeeDto {
    private Double licenceFee;
    private Double packedServicesFee;
    private Set<ResidenceServiceDto> valueAddedServices;
}
