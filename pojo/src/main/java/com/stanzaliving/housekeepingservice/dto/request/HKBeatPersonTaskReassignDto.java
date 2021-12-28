package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HKBeatPersonTaskReassignDto {

    private String uuid;

    private String personName;

    private String pseudoPersonUuid;

    private LocalDate day;

    private String beatPlanId;

    private String shiftUuid;

    private String slotUuid;

    private List<String> taskIds;

}
