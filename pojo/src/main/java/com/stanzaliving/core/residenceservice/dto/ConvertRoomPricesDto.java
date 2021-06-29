package com.stanzaliving.core.residenceservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConvertRoomPricesDto {

    Double basePrice;
    Double packagedServiceFee;
    Double foodService;
    Double gst;
    Double underWritten;
    double cityBuffer;
    double total;
    int roomConversionCharges;
}
