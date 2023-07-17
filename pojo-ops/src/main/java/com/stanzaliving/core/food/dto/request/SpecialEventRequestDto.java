package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.enums.SpecialEventType;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SpecialEventRequestDto {

    private LocalDate date;

    private SpecialEventType eventType;

    private String eventDescription;

    private boolean applicableToAllResidence;

    private Set<String> residences;
    
}
