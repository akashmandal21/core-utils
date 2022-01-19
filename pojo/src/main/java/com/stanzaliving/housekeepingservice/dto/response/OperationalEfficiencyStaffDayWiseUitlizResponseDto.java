package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

/**
 * @author Vikas S T
 * @date 18-Jan-22
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationalEfficiencyStaffDayWiseUitlizResponseDto {
    private String day;
    private double averageDailyStaffWiseUtilizationPercentage;
}
