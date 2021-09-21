package com.stanzaliving.estate_v2.dto.reviewTemplate;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HalfTableResponse implements LayoutData{
    private boolean iterative;
    private String iterativeCountVariableName;
    private String numberOfRows;
    private String numberOfColumns;
    private List<Map<String,TableAnswers>> tableData;
}
