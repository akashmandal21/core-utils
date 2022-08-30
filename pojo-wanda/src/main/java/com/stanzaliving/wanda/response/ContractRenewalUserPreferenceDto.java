package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractRenewalUserPreferenceDto extends UserPreferenceDto {

    private Boolean keepCurrentRoom;
    private String moveInDate;
    private String contractStartDate;
    private String contractEndDate;
    private String duration;
    private String bookingUuid;
    private String roomUuid;
    private String inventoryUuid;
    private String roomNumber;
    private int occupancy;
    private String currentBookingUuid;
    private List<String> contractPeriods;
}
