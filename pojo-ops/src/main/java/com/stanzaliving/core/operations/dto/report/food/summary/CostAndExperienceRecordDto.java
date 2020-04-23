package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostAndExperienceRecordDto extends RecordDto {

	private int movedInResidence;

	private int unsatisfied;

	private int satisfied;

	private int socialMediaComplaint;

	private int disasterEvent;

	private int shortage;

	private int processAdherence;

	private double totalMealCost;

	private double budgetedMealCost;

	private int occupiedBeds;

	private int totalMealsOrdered;

	private int totalStudentFeedback;

}