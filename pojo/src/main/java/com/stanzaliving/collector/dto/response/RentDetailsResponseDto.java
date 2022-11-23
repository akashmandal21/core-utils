package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import com.stanzaliving.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class RentDetailsResponseDto extends RecordDto {
    FeElementDto payableAmount;
    FeElementDto pendingAmount;
    FeElementDto pendingPercentage;
}
