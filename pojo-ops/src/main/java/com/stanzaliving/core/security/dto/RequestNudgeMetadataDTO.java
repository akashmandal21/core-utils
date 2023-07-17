package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.security.enums.RequestReason;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestNudgeMetadataDTO {

    private String message;

    private String requestType;

    private String startDate;

    private String endDate;

    private String startTime;

    private MealType nextMealType;

    private RequestReason reasonType;

    private Date date;

    private String attendanceRequestUuid;

    private String description;
}
