package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.PercentDto;
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

    int movedInResidence;

    PercentDto unsatisfied;

    PercentDto satisfied;

    int socialMediaComplaint;

    int disasterEvent;

    PercentDto processAdherence;

    PercentDto budgetUtilization;

    PercentDto costUtilization;

    double costPerMIR;

}
