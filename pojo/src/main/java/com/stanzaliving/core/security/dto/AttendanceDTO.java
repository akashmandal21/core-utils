package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDTO {

    @NotBlank(message = "Resident UUID cannot be empty")
    private String residentUuid;

    @NotBlank(message = "Residence UUID cannot be empty")
    private String residenceUuid;

    private String attendanceActivityTypeUuid;

    @NotNull(message = "Date cannot be null")
    private LocalDate date;

    private String verifiedBy;

    private String verificationMode;

    private LatLongDTO location;

    private String markedBy;

    private LocalDateTime markedAt;
}
