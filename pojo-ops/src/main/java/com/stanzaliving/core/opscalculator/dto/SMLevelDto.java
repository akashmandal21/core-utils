package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SMLevelDto {
    String serviceMixName;
    LocalDate fromDate;
    LocalDate toDate;
    String serviceMixUuid;
}
