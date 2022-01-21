package com.stanzaliving.core.opscalculator.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class UnderWrittenListingResponseDto {
        String versionName;
        String sessionDisplayName;
        LocalDate fromDate;
        LocalDate toDate;
        String uuid;
        String status;
        String seasonUuid;
        String serviceMixUuid;
}
