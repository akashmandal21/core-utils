package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComplianceRecordDto extends RecordDto {

	private int totalMeals;

	private int receivedOnTime;

	private int leftOver;

	private int shortage;

	private int feedback;

	private int menuAdherence;

	private double rating;

	private String vendorUuid;

	private String vendorName;

	private String mealUuid;

	private String mealName;

	private int shortageFilled;

	private int leftoverFilled;
}