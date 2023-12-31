package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ActionTrackerByGeographyResponseDto extends RentDetailsResponseDto  {

    FeElementDto pendingAmountForLastMonthAndBefore;
    FeElementDto pendingAmountContributionPercentage;
    FeElementDto pendingAmountContributionPercentageForLastMonthAndBefore;
}
