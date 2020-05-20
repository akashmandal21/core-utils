package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceTrackerResponseDto extends RentDetailsResponseDto {

    FeElementDto arrearsAmount;
    FeElementDto totalPendingAmount;
    FeElementDto totalPendingAmountContributionPercentage;

}
