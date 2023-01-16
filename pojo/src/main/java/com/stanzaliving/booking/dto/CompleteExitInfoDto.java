package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.enums.EventType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteExitInfoDto {
    private String taskMappingId;
    private String department;
    private String group;
    private String category;
    private TaskSubCategory taskSubCategory;
    private String resolvedByUuid;
    private LocalDateTime resolvedAt;
    private EventType eventType;
    private String microMarketUuid;
    private String residenceUuid;
    private String residenceName;
    private String userCode;
    private String roomNumber;
    private String bookingUuid;
    private String auditUuid;
    private String bookingStatus;
    private String bookingSubStatus;
    private LocalDate movedOutDate;
    private String exitStatus;
    private LocalDate auditRescheduledDate;
}
