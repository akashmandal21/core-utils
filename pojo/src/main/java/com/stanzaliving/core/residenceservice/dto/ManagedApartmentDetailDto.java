package com.stanzaliving.core.residenceservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class ManagedApartmentDetailDto implements Serializable {
    private String residenceUuid;
    private String residenceName;
    private String floor;
    private List<RoomDetailsDto> roomDetailsDto;
    private String bhkType;
    private Double startingPrice;
    private Double gstAmountLabel;
    private Double gstPercentageLabel;
    private float availableRooms = 0.0F;
    private float softBlockedRooms = 0.0F;
    private float occupiedRooms = 0.0F;
    private float deadRooms = 0.0F;
    private float totalRooms = 0.0F;
    private float blockedRooms = 0.0F;
    private String residenceCode;
    private Date availableFrom;


}
