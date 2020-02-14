package com.stanzaliving.core.operations.dto.response.report.food;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.FoodRatingBuckets;
import com.stanzaliving.core.operations.dto.report.food.UserFoodRatingDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.report.food.summary.SummaryRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.AdherenceResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.AttendanceResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.CostResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.ExperienceResponseDto;
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
public class SummaryResponseDto extends RecordDto {

	private ExperienceResponseDto experience;

	private AdherenceResponseDto processAdherence;

	private CostResponseDto costEfficiency;

	private AttendanceResponseDto attendance;

	public SummaryResponseDto(AccessLevel accessLevel, SummaryRecordDto summaryRecordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap, List<UserFoodRatingDto> foodRatingDtos) {

		FoodRatingBuckets foodRatingBuckets = FoodReportUtil.getFoodRatingBuckets(foodRatingDtos);

		int mir = FoodReportUtil.getMIRCount(accessLevel, summaryRecordDto, dateLevelFieldsMap);
		int occupiedBeds = FoodReportUtil.getOccupiedBedCount(accessLevel, summaryRecordDto, dateLevelFieldsMap);

		this.experience =
				ExperienceResponseDto.builder()
						.delighted(new FeElementDto(foodRatingBuckets.getDelightedResidents(), foodRatingBuckets.getTotalResidents(), FeElementType.PERCENT_INTEGER))
						.dissatisfied(new FeElementDto(foodRatingBuckets.getDissatisfiedResidents(), foodRatingBuckets.getTotalResidents(), FeElementType.PERCENT_INTEGER))
						.disgusted(new FeElementDto(foodRatingBuckets.getDisgustedResidents(), foodRatingBuckets.getTotalResidents(), FeElementType.PERCENT_INTEGER))
						.socialMediaComplaint(new FeElementDto(summaryRecordDto.getExperience().getSocialMediaComplaints()))
						.disasterEvent(new FeElementDto(summaryRecordDto.getExperience().getDisasterEvents()))
						.shortage(new FeElementDto(summaryRecordDto.getExperience().getShortage(), summaryRecordDto.getExperience().getShortageFilledTimes(), FeElementType.PERCENT_INTEGER))
						.build();

		this.processAdherence = AdherenceResponseDto.builder()
				.menuAdherence(new FeElementDto(summaryRecordDto.getProcessAdherence().getMenuAdherence(), summaryRecordDto.getProcessAdherence().getFoodReceivedTimes()))
				.quantityAdherence(new FeElementDto(summaryRecordDto.getProcessAdherence().getQuantityAdherence(), summaryRecordDto.getProcessAdherence().getQuantityReceivedTimes()))
				.onTimeDelivery(new FeElementDto(summaryRecordDto.getProcessAdherence().getOnTimeDelivery(), summaryRecordDto.getProcessAdherence().getFoodReceivedTimes()))
				.onTimeOrder(new FeElementDto(summaryRecordDto.getProcessAdherence().getOrderedOnTime(), summaryRecordDto.getProcessAdherence().getFoodOrderedTimes()))
				.onTimeMenuCreation(new FeElementDto(summaryRecordDto.getProcessAdherence().getMenuCreatedOnTime(), summaryRecordDto.getProcessAdherence().getMenuCreatedTimes()))
				.build();

		this.costEfficiency = CostResponseDto.builder()
				.budgetedCostPerStudent(new FeElementDto(summaryRecordDto.getCostEfficiency().getBudgetedMealCost(), mir, false, FeElementType.CURRENCY_INTEGER))
				.costPerStudent(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), mir, false, FeElementType.CURRENCY_INTEGER))
				.costUtilization(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), summaryRecordDto.getCostEfficiency().getExpectedMealCost()))
				.budgetUtilization(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), summaryRecordDto.getCostEfficiency().getBudgetedMealCost()))
				.build();

		this.attendance = AttendanceResponseDto.builder()
				.occupiedBeds(new FeElementDto(occupiedBeds, FeElementType.INTEGER))
				.movedInStudents(new FeElementDto(mir, FeElementType.INTEGER))
				.present(new FeElementDto(summaryRecordDto.getAttendance().getPresentStudents(), summaryRecordDto.getAttendance().getMovedInResidents()))
				.mealOrdered(new FeElementDto(summaryRecordDto.getAttendance().getTotalMealsOrdered(), summaryRecordDto.getAttendance().getMovedInResidents()))
				.foodAttendance(new FeElementDto(summaryRecordDto.getAttendance().getFoodAttendance(), summaryRecordDto.getAttendance().getMovedInResidents()))
				.build();
	}
}