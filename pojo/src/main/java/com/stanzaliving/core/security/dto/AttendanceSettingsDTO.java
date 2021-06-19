package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceSettingsDTO {

    @NotEmpty(message = "Attendance opt out status cannot be empty")
    private boolean attendanceOptOut;

    private boolean hasBlanketApproval;
}
