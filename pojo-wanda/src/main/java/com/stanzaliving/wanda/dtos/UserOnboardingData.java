package com.stanzaliving.wanda.dtos;

import com.stanzaliving.booking.dto.TaskSubCategory;
import com.stanzaliving.booking.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOnboardingData {
    private String taskMappingId;
    private String department;
    private String group;
    private String category;
    private TaskSubCategory taskSubCategory;
    private String taskSubCategoryName;
    private String resolvedByUuid;
    private LocalDateTime resolvedAt;
    private EventType eventType;
    private String microMarketUuid;
    private String residenceUuid;
    private String residenceName;
    private String userCode;
    private String roomNumber;
    private String bookingUuid;
    private String bookingStatus;
    private String bookingSubStatus;
    private Date moveInDate;
    private String roomUuid;
    private String isTaskCompleted;
}
