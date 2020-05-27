package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import com.stanzaliving.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ActionTrackerByResidentsResponseDto extends RentDetailsResponseDto {

    FeElementDto pendingContributionPercentage;
    FeElementDto lastInternetUsedDate;
    FeElementDto lastPaymentDate;
    FeElementDto contractEndDate;
    FeElementDto ventaUserUuid;
    FeElementDto ventaUserName;
    FeElementDto planOfAction;

}

