package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.PercentDto;
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

    double rating;

    PercentDto onTimeDelivery;

    PercentDto quantityAdherence;

    double rcAvgQualityRating;

    double studentAvgRating;

    PercentDto menuAdherence;

    PercentDto shortage;

    PercentDto foreignParticles;

    double totalBillAmount;

    double penaltyAmount;

}
