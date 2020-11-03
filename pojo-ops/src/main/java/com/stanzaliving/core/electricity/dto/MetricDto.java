package com.stanzaliving.core.electricity.dto;


import com.stanzaliving.core.electricity.constants.ReadingUnitType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MetricDto {
    private String categoryName;
    List<ValueDto> valueDtos;
}
