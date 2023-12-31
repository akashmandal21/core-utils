package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.enums.ResidenceBrand;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AnnualSeasonSummaryResponseDto {
    Integer totalAmount;
    String duration;
    Double percentageChange;
    List<AnnualUnderwrittenSummaryResponseDto> annualUnderwrittenSummaryList;

}
