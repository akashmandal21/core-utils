package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentAttendanceDTO {
    private ResidentAttendanceSummaryDTO summary;

    private List<ResidentDateDTO> dates;
}