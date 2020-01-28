package com.stanzaliving.core.operations.dto.report.food.graph;

import com.stanzaliving.core.operations.dto.report.GraphLineYPoint;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphLineYPointCostEfficiency extends GraphLineYPoint {
    Double y;
    Boolean Quantity;
    Boolean Menu;
    Boolean Holiday;
}
