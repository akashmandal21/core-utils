package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceTimingsDTO {

    private String residenceUuid;

    private String residenceName;

    private LocalTime curfewTimeStart;

    private LocalTime curfewTimeEnd;

    private LocalTime leaveApplicationTime;

    private LocalTime lateEntryTime;

    private LocalTime cutOffTimeRc;

    private LocalTime cutOffTimeNodal;

    private LocalTime cutOffTimeQrt;
}
