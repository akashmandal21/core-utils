package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private int occupancy;
    private String currentBookingUuid;
}
