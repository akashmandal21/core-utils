package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComplianceRecordDto extends RecordDto {

    int totalMeals;

    int receivedOnTime;

    int leftOver;

    int shortage;

    int feedback;

    int menuAdherence;

    double rating;

    String vendorUuid;
    
    String vendorName;
    
    String mealUuid;
    
    String mealName;

    int shortageFilled;

    int leftoverFilled;
}
