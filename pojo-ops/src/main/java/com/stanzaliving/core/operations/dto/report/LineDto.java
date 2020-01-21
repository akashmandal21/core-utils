package com.stanzaliving.core.operations.dto.report;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LineDto {
    String key;
    String value;
    List<String> xAxis;
    List<Double> yAxis;
    List<Object> metaData;
}
