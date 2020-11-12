package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.opscalculator.enums.MonthlyAlertType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MonthlyUnderWrittenAlertDto {
    private String title;
    private String message;
    private MonthlyAlertType alertType;
    private boolean isProceed;
}
