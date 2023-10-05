package com.stanzaliving.bifrost.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BifrostLogDto {
    private String tableName;
    private Map<String, Object> metaData;
    private long dateTime;
}
