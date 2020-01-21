package com.stanzaliving.core.operations.dto.report;

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
public class LineGraphDto {

    List<LineDto> lines = new ArrayList<>();
    String xLabel;
    String yLabel;

}
