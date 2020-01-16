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
public class CustomerExperienceRecordDto extends RecordDto {

    double experienceScore;

    PercentDto unsatisfied;

    PercentDto satisfied;

    PercentDto shortage;

    int foreignParticles;

    double rcAvgQualityRating;

    int socialMediaComplaint;

    PercentDto onTimeDelivery;

    PercentDto quantityAdherence;

    PercentDto menuAdherence;

    PercentDto smr;      // mealOrdered/feedbackGiven

}
