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
public class GraphLineDto {
    String key;
    String value;
    String accessLevel;
    List<GraphLinePointDto> data;
}
