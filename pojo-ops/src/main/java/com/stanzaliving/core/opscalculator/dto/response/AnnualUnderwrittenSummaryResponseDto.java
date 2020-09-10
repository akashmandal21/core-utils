package com.stanzaliving.core.opscalculator.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AnnualUnderwrittenSummaryResponseDto {
    LocalDate fromDate;
    LocalDate toDate;
    Integer amount;
}
