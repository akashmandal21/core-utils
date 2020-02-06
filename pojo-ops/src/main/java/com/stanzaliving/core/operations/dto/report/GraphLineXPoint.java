package com.stanzaliving.core.operations.dto.report;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphLineXPoint {
    String x;
    boolean highlight;
}
