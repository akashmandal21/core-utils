package com.stanzaliving.core.security.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.stanzaliving.core.security.enums.ResidentActivityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentActivityDTO {

    private String residentUuid;

    private ResidentActivityType residentActivityType;

    private String residentActivityDetails;

    private LocalDate activityDate;

    private LocalTime activityTime;

    private String bookingId;

    private String residentCode;
}
