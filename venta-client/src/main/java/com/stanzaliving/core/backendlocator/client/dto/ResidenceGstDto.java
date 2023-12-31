package com.stanzaliving.core.backendlocator.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResidenceGstDto {
    String residenceUuid;
    double cgst;
    double sgst;
    double igst;
    
    @Builder.Default
    double foodCgst = 2.5;
    
    @Builder.Default
    double foodSgst = 2.5;
}
