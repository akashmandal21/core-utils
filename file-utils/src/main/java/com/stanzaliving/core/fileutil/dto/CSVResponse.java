package com.stanzaliving.core.fileutil.dto;

import lombok.*;

import java.util.HashMap;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CSVResponse {
    private List<HashMap<String, String>> data;
    private int totalRecord;
    private List<String> header;
}
