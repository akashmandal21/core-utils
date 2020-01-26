package com.stanzaliving.core.operations.dto.response.report.food.summary;

import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.RecordDto;
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

	private FeElementDto unsatisfied;

	private FeElementDto satisfied;

	private FeElementDto socialMediaComplaint;

	private FeElementDto disasterEvent;

	private FeElementDto processAdherence;

	private FeElementDto budgetUtilization;

	private FeElementDto costUtilization;

	private FeElementDto costPerMIR;

	public CostAndExperienceRecordResponseDto(AccessLevel accessLevel, SummaryRecordDto summaryRecordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap, int daysConsidered) {

		super(summaryRecordDto);
		summaryRecordDto.setDaysConsidered(daysConsidered);

		CostAndExperienceRecordDto costAndExperienceRecordDto = summaryRecordDto.getCostAndExperienceRecordDto();

		Integer mir = FoodReportUtil.getMIRCount(accessLevel, summaryRecordDto, dateLevelFieldsMap);

		this.movedInResidence = new FeElementDto(mir / daysConsidered, FeElementType.INTEGER);

		this.unsatisfied = new FeElementDto(costAndExperienceRecordDto.getUnsatisfied(), costAndExperienceRecordDto.getSatisfied() + costAndExperienceRecordDto.getUnsatisfied());
		this.satisfied = new FeElementDto(costAndExperienceRecordDto.getSatisfied(), costAndExperienceRecordDto.getSatisfied() + costAndExperienceRecordDto.getUnsatisfied());

		this.socialMediaComplaint = new FeElementDto(costAndExperienceRecordDto.getSocialMediaComplaint());
		this.disasterEvent = new FeElementDto(costAndExperienceRecordDto.getDisasterEvent());

		this.budgetUtilization = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), costAndExperienceRecordDto.getBudgetedMealCost());
		this.costUtilization = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), summaryRecordDto.getCostEfficiency().getExcpectedMealCost());

		this.costPerMIR = new FeElementDto((double) costAndExperienceRecordDto.getTotalMealCost(), (double) costAndExperienceRecordDto.getTotalMealsOrdered(), false, FeElementType.DOUBLE);
	}

}