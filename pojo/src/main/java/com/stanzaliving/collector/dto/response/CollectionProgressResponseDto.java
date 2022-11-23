package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.FeElementDto;
import com.stanzaliving.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CollectionProgressResponseDto extends RecordDto {
    FeElementDto target;
    FeElementDto mtdCollection;
    FeElementDto percentAchieved;
    FeElementDto currentDateCollection;
    FeElementDto tMinusOneCollection;
    FeElementDto tMinusTwoCollection;
    FeElementDto tMinusThreeCollection;
    FeElementDto l7DayAvg;
    FeElementDto l30DayAvg;

}
