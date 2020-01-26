package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CustomerExperienceRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerExperienceRecordResponseDto extends RecordDto {

	private FeElementDto experienceScore;

	private FeElementDto unsatisfied;

	private FeElementDto satisfied;

	private FeElementDto shortage;

	private FeElementDto foreignParticles;

	private FeElementDto rcAvgQualityRating;

	private FeElementDto socialMediaComplaint;

	private FeElementDto onTimeDelivery;

	private FeElementDto quantityAdherence;

	private FeElementDto menuAdherence;

	private FeElementDto smr; // mealOrdered/feedbackGiven

	public CustomerExperienceRecordResponseDto(CustomerExperienceRecordDto customerExperienceRecordDto) {
		super(customerExperienceRecordDto);
		this.satisfied = new FeElementDto(customerExperienceRecordDto.getSatisfied(), customerExperienceRecordDto.getSatisfied() + customerExperienceRecordDto.getUnsatisfied());
		this.unsatisfied = new FeElementDto(customerExperienceRecordDto.getUnsatisfied(), customerExperienceRecordDto.getSatisfied() + customerExperienceRecordDto.getUnsatisfied());
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