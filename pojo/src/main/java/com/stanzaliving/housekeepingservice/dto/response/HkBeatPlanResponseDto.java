package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.housekeepingservice.dto.HkPlaningTemplatesDto;
import com.stanzaliving.housekeepingservice.enums.HkBeatPlanStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Vikas S T
 * @date 03-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPlanResponseDto {
    private HkPlaningTemplatesDto planingTemplate;
    private HkBeatPlanStatus planStatus;
    private LocalDate startDate;
    private LocalDate endDate;
    private String city;
    private String microClusterUuid;
    private List<HkBeatDaysResponseDto> hkDetails;
}
