package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.util.List;

/**
 * @author Vikas S T
 * @date 17-Jan-22
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationalEfficiencyHKStaffWiseUtilizResponseDto {
    private String hkPersonName;
    private List<OperationalEfficiencyStaffDayWiseUitlizResponseDto> days;
}
