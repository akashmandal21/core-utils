package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PackagedServiceInfoResponseDto {
    private Double feePerMonth;
    private String serviceMixUuid;
    private String serviceMixName;
    private List<Object> serviceDescription;
    private List<Object> serviceStayCurationDescription;
    private String serviceSetName;
    private Integer currentOptedInBookingsCount;
}
