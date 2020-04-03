package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.VendorRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorRecordResponseDto extends RecordDto {

	private FeElementDto rating;

	private FeElementDto onTimeAdherence;

	private FeElementDto quantityAdherence;

	private FeElementDto rcQualityFeedback;

	private FeElementDto studentFeedback;

	private FeElementDto menuAdherence;

	private FeElementDto shortageRecords;

	private FeElementDto foreignParticles;

	private FeElementDto totalBillAmount;

	private FeElementDto penaltyAmount;

	private String vendorUuid;

	private String vendorName;

	private String mealUuid;

	private String mealName;

	public VendorRecordResponseDto(VendorRecordDto vendorRecordDto) {
		super(vendorRecordDto);
		this.rating = new FeElementDto(vendorRecordDto.getRating(), vendorRecordDto.getRcFeedbackCount(), false, FeElementType.DOUBLE);
		this.onTimeAdherence = new FeElementDto(vendorRecordDto.getOnTimeAdherence(), vendorRecordDto.getFoodReceivedTimes());
		this.quantityAdherence = new FeElementDto(vendorRecordDto.getQuantityAdherence(), vendorRecordDto.getQuantityReceivingFilled());
		this.rcQualityFeedback = new FeElementDto(vendorRecordDto.getRcQualityFeedback(), vendorRecordDto.getRcFeedbackCount(), false, FeElementType.DOUBLE);
		this.studentFeedback = new FeElementDto(vendorRecordDto.getTotalRating(), vendorRecordDto.getStudentFeedbackCount(), false, FeElementType.DOUBLE);
		this.menuAdherence = new FeElementDto(vendorRecordDto.getMenuAdherence(), vendorRecordDto.getFoodReceivedTimes());
		this.shortageRecords = new FeElementDto(vendorRecordDto.getShortageRecords(), vendorRecordDto.getShortageFilled());
		this.foreignParticles = new FeElementDto(vendorRecordDto.getForeignParticles(), vendorRecordDto.getFoodReceivedTimes());
		this.totalBillAmount = new FeElementDto(vendorRecordDto.getTotalBillAmount(), FeElementType.CURRENCY_INTEGER);
		this.vendorUuid = vendorRecordDto.getVendorUuid();
		this.vendorName = vendorRecordDto.getVendorName();
		this.mealUuid = vendorRecordDto.getMealUuid();
		this.mealName = vendorRecordDto.getMealName();
	}

}