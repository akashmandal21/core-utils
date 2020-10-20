package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceMixDetailsRequestDto {
    private String residenceUuid;
    private int monthNumber;
    private int year;
    private String monthlyUnderWrittenUuid;
    private String seasonUuid;
}
