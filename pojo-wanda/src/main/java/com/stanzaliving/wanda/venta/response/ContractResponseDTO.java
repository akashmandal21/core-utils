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
    private long contractId;

    private String name;
    
    private String contractUuid;

    private double months;

    private boolean enabled;

    @Builder.Default
    private Double discountAmount = 0.0;
    
	private Boolean preSelectedContractId;

    private String discountCode;
}