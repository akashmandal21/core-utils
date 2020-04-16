package com.stanzaliving.core.estate.agg.entity;

import com.stanzaliving.designservice.enums.BedType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DesignBedInfo {
    Integer totalBedCount;
    Map<BedType,BedCountPair> brandBedCount;
}
