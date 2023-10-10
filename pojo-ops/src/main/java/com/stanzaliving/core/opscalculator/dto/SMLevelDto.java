package com.stanzaliving.core.opscalculator.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
