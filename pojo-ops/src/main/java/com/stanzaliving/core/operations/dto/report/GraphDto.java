package com.stanzaliving.core.operations.dto.report;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphDto {
    String chartTitle;
    String xLabel;
    String yLabel;
    String xType;
    String yType;
    AccessLevel accessLevel;
    List<GraphLineXPoint> xAxis = new ArrayList<>();
    List<GraphLineDto> yAxis = new ArrayList<>();
}
