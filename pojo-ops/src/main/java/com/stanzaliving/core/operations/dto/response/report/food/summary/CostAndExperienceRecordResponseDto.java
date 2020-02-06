package com.stanzaliving.core.operations.dto.response.report.food.summary;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.FoodRatingBuckets;
import com.stanzaliving.core.operations.dto.report.food.UserFoodRatingDto;
import com.stanzaliving.core.operations.dto.report.food.summary.CostAndExperienceRecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.report.food.summary.SummaryRecordDto;
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
public class CostAndExperienceRecordResponseDto extends RecordDto {

	private FeElementDto movedInResidence;

	private FeElementDto delighted;

	private FeElementDto dissatisfied;

	private FeElementDto disgusted;

	private FeElementDto socialMediaComplaint;

	private FeElementDto disasterEvent;

	private FeElementDto processAdherence;

	private FeElementDto budgetUtilization;

	private FeElementDto costUtilization;

	private FeElementDto costPerMIR;

	public CostAndExperienceRecordResponseDto(
			AccessLevel accessLevel, SummaryRecordDto summaryRecordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap, Map<String, List<UserFoodRatingDto>> foodRatingMap) {

		super(summaryRecordDto);

		CostAndExperienceRecordDto costAndExperienceRecordDto = summaryRecordDto.getCostAndExperienceRecordDto();

		Integer mir = FoodReportUtil.getMIRCount(accessLevel, summaryRecordDto, dateLevelFieldsMap);

		FoodRatingBuckets ratingBuckets = FoodReportUtil.getFoodRatingBuckets(accessLevel, summaryRecordDto, foodRatingMap);

		this.movedInResidence = new FeElementDto(mir, FeElementType.INTEGER);

		this.delighted = new FeElementDto(ratingBuckets.getDelightedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);
		this.dissatisfied = new FeElementDto(ratingBuckets.getDissatisfiedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);
		this.disgusted = new FeElementDto(ratingBuckets.getDisgustedResidents(), ratingBuckets.getTotalResidents(), FeElementType.PERCENT_DOUBLE);

		this.socialMediaComplaint = new FeElementDto(costAndExperienceRecordDto.getSocialMediaComplaint());
		this.disasterEvent = new FeElementDto(costAndExperienceRecordDto.getDisasterEvent());

		this.budgetUtilization = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), costAndExperienceRecordDto.getBudgetedMealCost());
		this.costUtilization = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), summaryRecordDto.getCostEfficiency().getExpectedMealCost());

		this.costPerMIR = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), mir, false, FeElementType.CURRENCY_INTEGER);
	}

}