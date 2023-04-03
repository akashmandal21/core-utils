package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.core.dto.PlanOptInRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PackagedServiceResponseDto implements Serializable {
    private Set<Object> serviceSet;
    private Double feePerMonth;
    private Double gstAmountLabel;
    private String serviceMixUuid;
    private String serviceMixName;
    private Integer currentOptedInBookingsCount;
    private List<PlanOptInRequestDto> planOptInRequestDtoList;
}
