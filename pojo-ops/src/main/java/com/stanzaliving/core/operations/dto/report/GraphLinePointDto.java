package com.stanzaliving.core.operations.dto.report;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphLinePointDto {
    String x;
    Object y;
    boolean highlight;
    String xPrefixLabel;
    String yPrefixLabel;
    String xSuffixLabel;
    String ySuffixLabel;
}
