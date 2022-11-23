package com.stanzaliving.core.fileutil.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CSVResponse {
    private List<Map<String, String>> data;
    private int totalRecord;
    private int totalRecordMatched;
    private List<String> filterHeader;
    private List<String> header;
}
