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
public class VendorRecordDto extends RecordDto {

    int totalCount;

    double rating;

    int onTimeAdherence;

    int quantityAdherence;

    double rcQualityFeedback;

    int totalRating;

    int studentFeedbackCount;

    int menuAdherence;

    int shortageRecords;

    int foreignParticles;

    String vendorUuid;

    String mealUuid;
}
