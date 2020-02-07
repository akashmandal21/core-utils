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
public class VendorRecordDto extends RecordDto {

	private int foodReceivedTimes;

	private double rating;

	private int onTimeAdherence;

	private int quantityAdherence;

	private double rcQualityFeedback;

	private int totalRating;

	private int studentFeedbackCount;

	private int menuAdherence;

	private int shortageRecords;

	private int foreignParticles;

	private String vendorUuid;

	private String vendorName;

	private String mealUuid;

	private String mealName;

	private double totalBillAmount;

	private int rcFeedbackCount;

	private int shortageFilled;
	
	private int quantityReceivingFilled;
}