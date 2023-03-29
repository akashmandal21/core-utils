package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PackagedServiceInfoResponseDto {

    private Double feePerMonth;
    private Double gstAmountLabel;
    private Double gstPercentageLabel;

    private String serviceMixUuid;
    private String serviceMixName;
    private String serviceSetName;

    private Integer currentOptedInBookingsCount;

    private List<Object> serviceDescription;
    private List<Object> serviceStayCurationDescription;

}