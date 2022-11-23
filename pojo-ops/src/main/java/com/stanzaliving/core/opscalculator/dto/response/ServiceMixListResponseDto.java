package com.stanzaliving.core.opscalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceMixListResponseDto {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String serviceMixName;
    private String serviceMixUuid;
    private String monthlyUnderWrittenUuid;
    private String muwServiceMixUuid;
    private Double overallCost;
    private Double costPerBedPerDay;
    private boolean serviceMixDetailsFilled;
}
