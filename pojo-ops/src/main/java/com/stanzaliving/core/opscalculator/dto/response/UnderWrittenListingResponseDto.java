package com.stanzaliving.core.opscalculator.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UnderWrittenListingResponseDto {
        String versionName;
        LocalDate fromDate;
        LocalDate toDate;
        String uuid;
        String status;
        String seasonUuid;
        String serviceMixUuid;
}
