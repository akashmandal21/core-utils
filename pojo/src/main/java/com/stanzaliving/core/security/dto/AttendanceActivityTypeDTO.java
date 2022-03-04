package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.AttendanceActionType;
import com.stanzaliving.core.security.enums.UserActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceActivityTypeDTO {

    private String uuid;
    private UserActionType userActionType;
    private AttendanceActionType attendanceActionType;
    private String description;
}