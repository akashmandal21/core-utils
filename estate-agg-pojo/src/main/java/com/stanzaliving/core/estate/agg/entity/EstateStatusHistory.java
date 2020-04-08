package com.stanzaliving.core.estate.agg.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstateStatusHistory {
    List<EstateStatusStruct> estateStatusTimeline;
}
