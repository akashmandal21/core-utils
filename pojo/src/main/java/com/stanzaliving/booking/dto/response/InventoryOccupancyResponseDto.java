package com.stanzaliving.booking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryOccupancyResponseDto {
    String bookingUuid;

    String roomUuid;

    String roomNumber;

    String residenceUuid;
}
