package com.stanzaliving.core.residenceservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class RoomPricingResponseDto {

    Double basePrice;
    Double bufferPrice;
    Double packagedServicesCGST;
    Double foodServiceCGST;
    Double foodServiceIGST;
    Double foodServicePrice;
    Double foodServiceSGST;
    Double packagedServicesIGST;
    Double packagedServicesPrice;
    Double roomPrice;
    Double packagedServicesSGST;
}
