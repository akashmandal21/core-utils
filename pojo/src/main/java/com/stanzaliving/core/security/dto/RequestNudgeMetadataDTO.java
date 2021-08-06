package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.RequestReason;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    //TODO : will replace with enum when available
    private String nextMealType;

    private RequestReason reasonType;

    private Date date;
}
