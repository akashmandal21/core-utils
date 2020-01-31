package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.report.food.summary.SummaryRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.AdherenceResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.AttendanceResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.CostResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.ExperienceResponseDto;
import com.stanzaliving.core.operations.enums.FeElementType;

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

	public SummaryResponseDto(SummaryRecordDto summaryRecordDto, DateLevelNumbersDto dateLevelNumbersDto) {

		this.experience =
				ExperienceResponseDto.builder()
						.unhappy(new FeElementDto(summaryRecordDto.getExperience().getUnsatisfied(),
								summaryRecordDto.getExperience().getSatisfied() + summaryRecordDto.getExperience().getUnsatisfied(), FeElementType.PERCENT_INTEGER))
						.satisfied(new FeElementDto(summaryRecordDto.getExperience().getSatisfied(),
								summaryRecordDto.getExperience().getSatisfied() + summaryRecordDto.getExperience().getUnsatisfied(), FeElementType.PERCENT_INTEGER))
						.socialMediaComplaint(new FeElementDto(summaryRecordDto.getExperience().getSocialMediaComplaints()))
						.disasterEvent(new FeElementDto(summaryRecordDto.getExperience().getDisasterEvents()))
						.shortage(new FeElementDto(summaryRecordDto.getExperience().getShortage(), summaryRecordDto.getTotalCount(), FeElementType.PERCENT_INTEGER))
						.build();

		this.processAdherence = AdherenceResponseDto.builder()
				.menuAdherence(new FeElementDto(summaryRecordDto.getProcessAdherence().getMenuAdherence(), summaryRecordDto.getTotalCount()))
				.quantityAdherence(new FeElementDto(summaryRecordDto.getProcessAdherence().getQuantityAdherence(), summaryRecordDto.getTotalCount()))
				.onTimeDelivery(new FeElementDto(summaryRecordDto.getProcessAdherence().getOnTimeDelivery(), summaryRecordDto.getTotalCount()))
				.onTimeOrder(new FeElementDto(summaryRecordDto.getProcessAdherence().getOrderedOnTime(), summaryRecordDto.getTotalCount()))
				.onTimeMenuCreation(new FeElementDto(summaryRecordDto.getProcessAdherence().getMenuCreated(), summaryRecordDto.getTotalCount()))
				.build();

		this.costEfficiency = CostResponseDto.builder()
				.budgetedCostPerStudent(
						new FeElementDto(summaryRecordDto.getCostEfficiency().getBudgetedMealCost(), dateLevelNumbersDto.getMovedInResidents(), false, FeElementType.CURRENCY_INTEGER))
				.costPerStudent(
						new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), dateLevelNumbersDto.getMovedInResidents(), false, FeElementType.CURRENCY_INTEGER))
				.costUtilization(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), summaryRecordDto.getCostEfficiency().getExpectedMealCost()))
				.budgetUtilization(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), summaryRecordDto.getCostEfficiency().getBudgetedMealCost()))
				.build();

		this.attendance = AttendanceResponseDto.builder()
				.occupiedBeds(new FeElementDto(dateLevelNumbersDto.getOccupiedBeds()))
				.movedInStudents(new FeElementDto(dateLevelNumbersDto.getMovedInResidents()))
				.present(new FeElementDto(summaryRecordDto.getAttendance().getPresentStudents(), summaryRecordDto.getAttendance().getMovedInResidents()))
				.mealOrdered(new FeElementDto(summaryRecordDto.getAttendance().getTotalMealsOrdered(), summaryRecordDto.getAttendance().getMovedInResidents()))
				.foodAttendance(new FeElementDto(summaryRecordDto.getAttendance().getFoodAttendance(), summaryRecordDto.getAttendance().getMovedInResidents()))
				.build();
	}
}