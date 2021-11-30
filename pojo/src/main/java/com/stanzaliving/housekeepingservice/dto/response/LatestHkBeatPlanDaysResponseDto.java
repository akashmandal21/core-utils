package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.ShiftDetailsResponse;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Vikas S T
 * @date 29-Nov-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class LatestHkBeatPlanDaysResponseDto {
    private LocalDate date;
    private String day;
    private List<ShiftDetailsResponse> shifts;
    private List<HkBeatPersonResponseDto> hkPersons;
}
