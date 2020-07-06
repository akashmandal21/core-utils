package com.stanzaliving.dashboard.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode
public class GraphLineXPoint {
    String x;
    boolean highlight;
}
