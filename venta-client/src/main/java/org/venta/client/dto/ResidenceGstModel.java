package org.venta.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ResidenceGstModel {
    String residenceUuid;
    double cgst;
    double sgst;
    double igst;
    
    @Builder.Default
    double food = 5;
}
