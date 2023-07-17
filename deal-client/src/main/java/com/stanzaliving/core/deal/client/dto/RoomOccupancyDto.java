package com.stanzaliving.core.deal.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomOccupancyDto {

    private Date fromDate;

    private Date toDate;

    private Map<String, String> roomNumbers;

    private Integer occupancy;

    private Boolean nonMgBed;

}
