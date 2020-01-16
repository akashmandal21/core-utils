package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
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
}
