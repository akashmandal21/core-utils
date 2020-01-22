package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.SummaryRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.AdherenceResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.AttendanceResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.CostResponseDto;
import com.stanzaliving.core.operations.dto.response.report.food.summary.ExperienceResponseDto;
import com.stanzaliving.core.operations.enums.FeElementType;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SummaryResponseDto extends RecordDto {
    ExperienceResponseDto experience;
    AdherenceResponseDto processAdherence;
    CostResponseDto costEfficiency;
    AttendanceResponseDto attendance;

    public SummaryResponseDto(SummaryRecordDto summaryRecordDto) {
        this.experience = ExperienceResponseDto.builder()
                .unsatisfied(new FeElementDto(summaryRecordDto.getExperience().getUnsatisfied(), summaryRecordDto.getExperience().getSatisfied() + summaryRecordDto.getExperience().getUnsatisfied()))
                .satisfied(new FeElementDto(summaryRecordDto.getExperience().getSatisfied(), summaryRecordDto.getExperience().getSatisfied() + summaryRecordDto.getExperience().getUnsatisfied()))
                .socialMediaComplaint(new FeElementDto(summaryRecordDto.getExperience().getSocialMediaComplaints()))
                .disasterEvent(new FeElementDto(summaryRecordDto.getExperience().getDisasterEvents()))
                .shortage(new FeElementDto(summaryRecordDto.getExperience().getShortage(), summaryRecordDto.getTotalCount()))
                .build();
        this.processAdherence = AdherenceResponseDto.builder()
                .menuAdherence(new FeElementDto(summaryRecordDto.getProcessAdherence().getMenuAdherence(), summaryRecordDto.getTotalCount()))
                .quantityAdherence(new FeElementDto(summaryRecordDto.getProcessAdherence().getQuantityAdherence(), summaryRecordDto.getTotalCount()))
                .onTimeDelivery(new FeElementDto(summaryRecordDto.getProcessAdherence().getOnTimeDelivery(), summaryRecordDto.getTotalCount()))
                .onTimeOrder(new FeElementDto(summaryRecordDto.getProcessAdherence().getOrderedOnTime(), summaryRecordDto.getTotalCount()))
                .onTimeMenuCreation(new FeElementDto(summaryRecordDto.getProcessAdherence().getMenuCreated(), summaryRecordDto.getTotalCount()))
                .build();
        double averageCost = summaryRecordDto.getCostEfficiency().getOccupiedBeds() != 0 ? summaryRecordDto.getCostEfficiency().getTotalMealCost() / summaryRecordDto.getCostEfficiency().getTotalMealsOrdered() : 0;
        this.costEfficiency = CostResponseDto.builder()
                .budgetedCostPerStudent(new FeElementDto(summaryRecordDto.getCostEfficiency().getBudgetedMealCost(), summaryRecordDto.getCostEfficiency().getMovedInResidents(), false, FeElementType.DOUBLE))
                .costPerStudent(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), (double)summaryRecordDto.getCostEfficiency().getTotalMealsOrdered(),false, FeElementType.DOUBLE))
                .costUtilization(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), averageCost*summaryRecordDto.getCostEfficiency().getOccupiedBeds()))
                .budgetUtilization(new FeElementDto(summaryRecordDto.getCostEfficiency().getTotalMealCost(), summaryRecordDto.getCostEfficiency().getBudgetedMealCost()))
                .build();
        this.attendance = AttendanceResponseDto.builder()
                .occupiedBeds(new FeElementDto(summaryRecordDto.getAttendance().getOccupiedBeds()))
                .movedInStudents(new FeElementDto(summaryRecordDto.getAttendance().getMovedInResidents()))
                .present(new FeElementDto(summaryRecordDto.getAttendance().getPresentStudents(), summaryRecordDto.getDaysConsidered()))
                .mealOrdered(new FeElementDto(summaryRecordDto.getAttendance().getTotalMealsOrdered(), summaryRecordDto.getAttendance().getMovedInResidents()))
                .foodAttendance(new FeElementDto(summaryRecordDto.getAttendance().getFoodAttendance(), summaryRecordDto.getTotalCount()))
                .build();
    }
}
