package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPlanAttributesMetadataDto {
    Double roomPrice;
    Double servicePrice;
    Double foodPrice;
    String residenceId;
    String occupancyId;
    Double noOfBeds;
}
