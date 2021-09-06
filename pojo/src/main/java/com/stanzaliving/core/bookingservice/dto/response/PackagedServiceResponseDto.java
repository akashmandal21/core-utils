package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PackagedServiceResponseDto {
    private Set<Object> serviceSet;
    private Double feePerMonth;
    private String serviceMixUuid;
    private String serviceMixName;
}
