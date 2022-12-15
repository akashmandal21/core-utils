package com.stanzaliving.core.residenceservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDetailsDto implements Serializable {
    String uuid;
    String roomStatus;
    private float availableBeds = 0.0F;
    private float occupiedBeds = 0.0F;
    private float softBlockedBeds = 0.0F;
    private float deadBeds = 0.0F;
    private float totalBeds = 0.0F;
    private float blockedBeds = 0.0F;
    private String convertedOccupancy;
}
