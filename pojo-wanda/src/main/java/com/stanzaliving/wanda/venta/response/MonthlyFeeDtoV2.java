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
public class MonthlyFeeDtoV2 {
    private Double licenceFee;
    private Double packedServicesFee;
    private Double foodServicesFee;
    private Set<ResidenceServiceDtoV2> valueAddedServices;
    private Double totalAccommodationCharge;
    private Double accommodationCharge;
    private Double accommodationChargeGstValue;
    private Double onmRentalCharges;
    private Double onmServiceCharges;
    private Double onmGstValue;
    private Double onmGstPercentage;
    private Double totalOnmServiceCharges;
}
