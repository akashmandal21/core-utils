package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.VendorRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorRecordResponseDto extends RecordDto {

    FeElementDto rating;

    FeElementDto onTimeAdherence;

    FeElementDto quantityAdherence;

    FeElementDto rcQualityFeedback;

    FeElementDto studentFeedback;

    FeElementDto menuAdherence;

    FeElementDto shortageRecords;

    FeElementDto foreignParticles;

    FeElementDto totalBillAmount;

    FeElementDto penaltyAmount;
    
    public VendorRecordResponseDto (VendorRecordDto vendorRecordDto) {
    	super(vendorRecordDto);
    	this.rating=new FeElementDto(vendorRecordDto.getRating());
    	this.onTimeAdherence=new FeElementDto(vendorRecordDto.getOnTimeAdherence(),vendorRecordDto.getTotalCount());
    	this.quantityAdherence=new FeElementDto(vendorRecordDto.getQuantityAdherence(),vendorRecordDto.getTotalCount());
    	this.rcQualityFeedback=new FeElementDto(vendorRecordDto.getRcQualityFeedback());
    	this.studentFeedback=new FeElementDto(vendorRecordDto.getTotalRating(),vendorRecordDto.getStudentFeedbackCount());
    	this.menuAdherence=new FeElementDto(vendorRecordDto.getMenuAdherence(),vendorRecordDto.getTotalCount());
    	this.shortageRecords=new FeElementDto(vendorRecordDto.getShortageRecords(),vendorRecordDto.getTotalCount());
    	this.foreignParticles=new FeElementDto(vendorRecordDto.getForeignParticles(),vendorRecordDto.getTotalCount());
    	
    	
    }

}
