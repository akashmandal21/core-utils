package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.ComplianceRecordDto;
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
public class ComplianceRecordResponseDto extends RecordDto {

    FeElementDto totalMeals;

    FeElementDto receivedOnTime;

    FeElementDto leftOver;

    FeElementDto shortage;

    FeElementDto feedback;

    FeElementDto rating;

    public ComplianceRecordResponseDto(ComplianceRecordDto complianceRecordDto) {
        super(complianceRecordDto);
        this.totalMeals = new FeElementDto(complianceRecordDto.getTotalMeals());
        this.receivedOnTime = new FeElementDto(complianceRecordDto.getReceivedOnTime(), complianceRecordDto.getTotalMeals(), false, FeElementType.FRACTION);
        this.leftOver = new FeElementDto(complianceRecordDto.getLeftOver(), complianceRecordDto.getTotalMeals());
        this.shortage = new FeElementDto(complianceRecordDto.getShortage(), complianceRecordDto.getTotalMeals());
        this.feedback = new FeElementDto(complianceRecordDto.getFeedback(), complianceRecordDto.getTotalMeals());
        this.rating = new FeElementDto(complianceRecordDto.getRating());
    }
}
