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
public class CustomerExperienceRecordResponseDto extends RecordDto {

    FeElementDto experienceScore;

    FeElementDto unsatisfied;

    FeElementDto satisfied;

    FeElementDto shortage;

    FeElementDto foreignParticles;

    FeElementDto rcAvgQualityRating;

    FeElementDto socialMediaComplaint;

    FeElementDto onTimeDelivery;

    FeElementDto quantityAdherence;

    FeElementDto menuAdherence;

    FeElementDto smr;

}
