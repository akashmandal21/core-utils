package com.stanzaliving.core.residenceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConvertRoomPricesDto {

    Double basePrice;
    Double packagedServiceFee;
    Double foodService;
    Double gst;
    Double underWritten;
    Double cityBuffer;
    Double total;
    int roomConversionCharges;
    String serviceMixUUID;
    Double beforeConversionPrice;
    int currentOccupancy;
}
