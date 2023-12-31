package com.stanzaliving.core.operations.dto.response.report.food;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.constants.FoodReportConstants;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CustomerExperienceRecordDto;
import com.stanzaliving.core.operations.dto.report.food.FoodRatingBuckets;
import com.stanzaliving.core.operations.dto.report.food.UserFoodRatingDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;
import com.stanzaliving.core.operations.utils.FoodReportUtil;

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

	private FeElementDto delighted;

//	private FeElementDto satisfied;

//	private FeElementDto dissatisfied;

	private FeElementDto disgusted;

	private FeElementDto delightedMinusDisgusted;

	private FeElementDto shortage;

	private FeElementDto foreignParticles;

	private FeElementDto rcAvgQualityRating;

	private FeElementDto socialMediaComplaint;

	private FeElementDto onTimeDelivery;

	private FeElementDto quantityAdherence;

	private FeElementDto menuAdherence;

	private FeElementDto smr; // feedbackGiven/mealsOrdered

	private FeElementDto mir;

	public CustomerExperienceRecordResponseDto(
			AccessLevel accessLevel,
			CustomerExperienceRecordDto customerExperienceRecordDto,
			Map<String, List<UserFoodRatingDto>> foodRatingMap,
			Map<String, List<UserFoodRatingDto>> completeFoodRatingMap,
			Map<String, DateLevelNumbersDto> dateLevelFieldsMap,
			int daysConsidered) {

		super(customerExperienceRecordDto);

		int mir = FoodReportUtil.getMIRCount(accessLevel, customerExperienceRecordDto, dateLevelFieldsMap);

		double activeMeals = FoodReportUtil.getActiveMealsCount(accessLevel, customerExperienceRecordDto, dateLevelFieldsMap);

		double residences = FoodReportUtil.getResidenceCount(accessLevel, customerExperienceRecordDto, dateLevelFieldsMap);

		int totalMeals = (int) ((activeMeals * daysConsidered * mir * FoodReportConstants.MAX_EXPECTED_PRESENT_PERCENT) / residences);

		FoodRatingBuckets ratingBuckets = FoodReportUtil.getFoodRatingBuckets(accessLevel, customerExperienceRecordDto, foodRatingMap);

		//FoodRatingBuckets completeRatingBuckets = FoodReportUtil.getFoodRatingBuckets(accessLevel, customerExperienceRecordDto, completeFoodRatingMap);

		this.delighted = new FeElementDto(ratingBuckets.getDelightedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);
//		this.satisfied = new FeElementDto(ratingBuckets.getSatisfiedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);
//		this.dissatisfied = new FeElementDto(ratingBuckets.getDissatisfiedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);
		this.disgusted = new FeElementDto(ratingBuckets.getDisgustedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);
		this.delightedMinusDisgusted = new FeElementDto(ratingBuckets.getDelightedResidents() - ratingBuckets.getDisgustedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);

		this.shortage = new FeElementDto(customerExperienceRecordDto.getShortageCount());
		this.foreignParticles = new FeElementDto(customerExperienceRecordDto.getForeignParticle(), FeElementType.INTEGER);
		this.socialMediaComplaint = new FeElementDto(customerExperienceRecordDto.getSocialMediaComplaints(), FeElementType.INTEGER);

		this.rcAvgQualityRating = new FeElementDto(customerExperienceRecordDto.getRcAvgQualityRating() / customerExperienceRecordDto.getRcFeedbackCount(), FeElementType.DOUBLE);
		this.onTimeDelivery = new FeElementDto(customerExperienceRecordDto.getOnTimeDelivery(), customerExperienceRecordDto.getFoodReceivingFilled(), FeElementType.PERCENT_INTEGER);
		this.quantityAdherence = new FeElementDto(customerExperienceRecordDto.getQuantityAdherence(), customerExperienceRecordDto.getQuantityReceivingFilled(), FeElementType.PERCENT_INTEGER);
		this.menuAdherence = new FeElementDto(customerExperienceRecordDto.getMenuAdherence(), customerExperienceRecordDto.getFoodReceivingFilled(), FeElementType.PERCENT_INTEGER);

		this.smr = new FeElementDto(customerExperienceRecordDto.getTotalStudentFeedback(), totalMeals, FeElementType.PERCENT_DOUBLE);
		this.mir = new FeElementDto(mir);
	}
}