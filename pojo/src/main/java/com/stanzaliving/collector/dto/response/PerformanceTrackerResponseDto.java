package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceTrackerResponseDto extends RentDetailsResponseDto {

    FeElementDto arrearsAmount;
    FeElementDto totalPendingAmount;
    FeElementDto totalPendingAmountContributionPercentage;

}
