package com.stanzaliving.core.estate.embeddedinfos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BedCountInfo {
    private Integer totalCount;
    private Map<String,Integer> designFileToBedCount;
}
