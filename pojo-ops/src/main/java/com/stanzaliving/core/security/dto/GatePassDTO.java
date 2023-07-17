package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GatePassDTO {
    private ResidentDTO residentDTO;

    private AttendanceRequestDTO attendanceRequestDTO;

    private ResidenceTimingsDTO residenceTimingsDTO;
}
