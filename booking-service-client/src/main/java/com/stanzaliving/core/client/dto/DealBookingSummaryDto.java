package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author jai.jain
 * @package_name com.stanza-living.core.client.dto
 * @date 01/06/23
 * @time 16:10
 * @project_name booking-service-v2
 **/

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DealBookingSummaryDto {

    public String userUuid;
    public String roomUuid;
    public String roomNumber;
    public String bookingUuid;
    public String roomOccupancy;
    public String residenceUuid;

    public Date contractEndDate;
    public Date contractStartDate;

    public List<String> roomAttributes;

}