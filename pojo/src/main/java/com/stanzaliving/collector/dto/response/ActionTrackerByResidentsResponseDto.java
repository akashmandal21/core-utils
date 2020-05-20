package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import com.stanzaliving.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActionTrackerByResidentsResponseDto extends RentDetailsResponseDto {

    FeElementDto lastInternetUsedDate;
    FeElementDto lastPaymentDate;
    FeElementDto contractEndDate;
    FeElementDto ventaUserId;
    FeElementDto ventaUserName;
}

