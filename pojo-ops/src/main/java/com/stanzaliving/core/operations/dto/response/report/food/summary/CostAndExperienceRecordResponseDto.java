package com.stanzaliving.core.operations.dto.response.report.food.summary;

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
public class CostAndExperienceRecordResponseDto extends RecordDto {

    FeElementDto movedInResidence;

    FeElementDto unsatisfied;

    FeElementDto satisfied;

    FeElementDto socialMediaComplaint;

    FeElementDto disasterEvent;

    FeElementDto processAdherence;

    FeElementDto budgetUtilization;

    FeElementDto costUtilization;

    FeElementDto costPerMIR;

}
