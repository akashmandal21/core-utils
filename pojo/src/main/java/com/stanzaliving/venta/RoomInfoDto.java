package com.stanzaliving.venta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomInfoDto {

    private String roomNumber;
    private float noOfBeds;
    private int floorNumber;
}
