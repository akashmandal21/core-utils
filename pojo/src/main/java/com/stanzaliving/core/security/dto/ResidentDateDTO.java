package com.stanzaliving.core.security.dto;

import java.time.LocalDate;

import com.stanzaliving.core.security.enums.AttendanceStatus;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidentDateDTO {

    private LocalDate date;

    private AttendanceStatus status;
}
