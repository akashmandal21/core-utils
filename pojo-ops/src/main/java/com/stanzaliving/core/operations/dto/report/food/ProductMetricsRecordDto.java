package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProductMetricsRecordDto extends RecordDto {

	private int mealsCount;

	private int menuCreated;

	private int orderCreated;

	private int foodReceived;

	private int shortageFilled;

	private int leftoverFilled;

	private int rcFeedbackGiven;

	private String mealUuid;

	private String mealName;

	private int totalStudentFeedback;

}