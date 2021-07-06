package com.stanzaliving.core.security.dto;

import java.time.LocalDateTime;

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

    private String description;

    private String residentActivityDetails;

    private LocalDateTime activityTime;
}
