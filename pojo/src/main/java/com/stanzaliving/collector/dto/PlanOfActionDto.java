package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanOfActionDto implements Comparable<PlanOfActionDto> {
    LocalDate created;
    @Builder.Default
    Double amount = null;
    String Type;
    LocalDate nextFollowupDate;
    String planOfAction;
    String comment;

    @Override
    public int compareTo(PlanOfActionDto planOfActionDto) {
        if (this.created.isEqual(planOfActionDto.created ))
            return 0;
        return this.created.isBefore(planOfActionDto.created ) ? 1 : -1;
    }
}
