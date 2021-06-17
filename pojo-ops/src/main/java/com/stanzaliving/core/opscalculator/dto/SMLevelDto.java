package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SMLevelDto {
    String serviceMixName;
    LocalDate fromDate;
    LocalDate toDate;
    String serviceMixUuid;
}
