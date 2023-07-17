package com.stanzaliving.core.security.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCommercialsMigrationDTO {

    @JsonSetter(value = "BOOKING_ID")
    private String bookingId;

    @JsonSetter(value = "MAINTENANCE_FEE_SELECTION_ID")
    private Integer maintenanceFeeSelectionId;

    @JsonSetter(value = "SECURITY_DEPOSIT")
    private Double securityDeposit;
}
