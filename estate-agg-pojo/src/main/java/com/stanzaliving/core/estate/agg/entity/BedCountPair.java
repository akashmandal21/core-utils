package com.stanzaliving.core.estate.agg.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BedCountPair{
    private Date lastUpdatedAt;
    private Integer count;
    private Map<String,Integer> designFileToBedCount;
}
