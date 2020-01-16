package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorRecordResponseDto extends RecordDto {

    FeElementDto rating;

    FeElementDto onTimeDelivery;

    FeElementDto quantityAdherence;

    FeElementDto rcAvgQualityRating;

    FeElementDto studentAvgRating;

    FeElementDto menuAdherence;

    FeElementDto shortage;

    FeElementDto foreignParticles;

    FeElementDto totalBillAmount;

    FeElementDto penaltyAmount;

}
