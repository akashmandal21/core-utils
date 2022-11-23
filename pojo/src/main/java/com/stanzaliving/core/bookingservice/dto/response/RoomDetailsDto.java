package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.core.residenceservice.enums.RoomStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetailsDto {

    private String roomUUID;
    private String roomCode;
    private String floor;
    private String residenceName;
    private String residenceUuid;
    private Double totalBedAvailable;
    private String availableFrom;
    private String inventoryUuid;
    private int totalOccupancy; //original occupancy
    private int convertedOccupancy;
    private boolean enableEditOccupancy;
    private RoomStatus roomStatus;
    private boolean isSelfConverted;
    private String disabledReason;
    private String reason;
    private Double beds;
}