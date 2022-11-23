package com.stanzaliving.core.security.dto;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceTimingsRequestDTO {

    private int attendanceWindowQrt;

    private LocalTime startTimeQrt;

    private LocalTime startTimeRc;

    private int attendanceWindowRc;

    private LocalTime curfewTime;

    private Boolean isResidentAttendanceEnabled;

    private LocalTime startTimeNodal;

    private int attendanceWindowNodal;
}
