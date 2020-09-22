package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractResponseDTO {
    private int contractId;

    private String name;

    private double months;

    private boolean enabled;

    private Double discountAmount = 0.0;
    
	private Boolean preSelectedContractId;

    private String discountCode;
}