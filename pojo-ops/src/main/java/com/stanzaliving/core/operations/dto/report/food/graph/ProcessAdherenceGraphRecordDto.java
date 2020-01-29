package com.stanzaliving.core.operations.dto.report.food.graph;

import com.stanzaliving.core.operations.dto.report.GraphRecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessAdherenceGraphRecordDto extends GraphRecordDto {

    Integer totalCount;
    Integer menuAdherence;
    Integer quantityAdherence;
    Integer onTimeDelivery;
    Integer orderedOnTime;
    Integer menuCreated;

}