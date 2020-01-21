package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CustomerExperienceRecordDto;
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

    FeElementDto smr;       // mealOrdered/feedbackGiven

    public CustomerExperienceRecordResponseDto(CustomerExperienceRecordDto customerExperienceRecordDto) {
        super(customerExperienceRecordDto);
        this.satisfied = new FeElementDto(customerExperienceRecordDto.getSatisfied(), customerExperienceRecordDto.getSatisfied() + customerExperienceRecordDto.getUnsatisfied());
        this.unsatisfied = new FeElementDto(customerExperienceRecordDto.getSatisfied(), customerExperienceRecordDto.getSatisfied() + customerExperienceRecordDto.getUnsatisfied());
        this.shortage = new FeElementDto(customerExperienceRecordDto.getShortageCount(), customerExperienceRecordDto.getTotalCount());
        this.foreignParticles = new FeElementDto(customerExperienceRecordDto.getForeignParticle());
        this.rcAvgQualityRating = new FeElementDto(customerExperienceRecordDto.getRcAvgQualityRating());
        this.socialMediaComplaint = new FeElementDto(customerExperienceRecordDto.getSocialMediaComplaints());
        this.onTimeDelivery = new FeElementDto(customerExperienceRecordDto.getOnTimeDelivery(), customerExperienceRecordDto.getTotalCount());
        this.quantityAdherence = new FeElementDto(customerExperienceRecordDto.getQuantityAdherence(), customerExperienceRecordDto.getTotalCount());
        this.menuAdherence = new FeElementDto(customerExperienceRecordDto.getMenuAdherence(), customerExperienceRecordDto.getTotalCount());
        this.smr = new FeElementDto(customerExperienceRecordDto.getMealOrdered(), customerExperienceRecordDto.getNumStudentsFeedback());
    }
}
