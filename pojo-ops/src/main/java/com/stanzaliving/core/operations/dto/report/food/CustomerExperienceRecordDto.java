package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;

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
public class CustomerExperienceRecordDto extends RecordDto {

	private int satisfied;

	private int unsatisfied;

	private int shortageCount;

	private int totalCount;

	private int foreignParticle;

	private Double rcAvgQualityRating;

	private int socialMediaComplaints;

	private int onTimeDelivery;

	private int quantityAdherence;

	private int menuAdherence;

	private int mealOrdered;

	private int numStudentsFeedback;

	private int foodReceivingFilled;
	
	private int quantityReceivingFilled;
	
	private int rcFeedbackCount;

	private int shortageFilled;

	private int mir;

}