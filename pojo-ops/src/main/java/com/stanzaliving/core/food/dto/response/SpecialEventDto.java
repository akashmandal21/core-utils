package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.SpecialEventType;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SpecialEventDto {
    
    private String eventUuid;
    
    private LocalDate date;

    private SpecialEventType eventType;

    private String eventDescription;
    
    private boolean applicableToAllResidence;
    
    private Integer applicableToResidences;
    
    private Set<String> micromarketsSelected;
    
    private Set<String> citiesSelected;
    
    private Set<String> residences;
    
    
}
