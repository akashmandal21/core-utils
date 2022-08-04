package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.AttendanceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentAttendanceDTO {
    private Map<AttendanceStatus, Integer> statusWiseCount;

    private List<ResidentDateDTO> dates;
}