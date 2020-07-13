package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import com.stanzaliving.dashboard.dto.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
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
    FeElementDto nextFollowUp;
    String bookingUuid;

}

