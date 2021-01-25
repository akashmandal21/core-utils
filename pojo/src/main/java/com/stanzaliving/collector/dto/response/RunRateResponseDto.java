package com.stanzaliving.collector.dto.response;

import com.stanzaliving.dashboard.dto.GraphDto;
import com.stanzaliving.dashboard.dto.HistogramDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class RunRateResponseDto {
    GraphDto graphDto;
    HistogramDto histogramDto;
}
