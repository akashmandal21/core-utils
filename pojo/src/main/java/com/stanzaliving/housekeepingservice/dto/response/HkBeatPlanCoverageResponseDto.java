package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

/**
 * @author Vikas S T
 * @date 06-Nov-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPlanCoverageResponseDto {

    private String dailyPlannedData;
    private String dailyPromisedData;
    private String oncePlannedData;
    private String oncePromisedData;
    private String twicePlannedData;
    private String twicePromisedData;
    private String thricePlannedData;
    private String thricePromisedData;
    private String taskCategoryUuid;
    private String taskSubCategoryUuid;
    private int totalNumberOfRooms;

}
