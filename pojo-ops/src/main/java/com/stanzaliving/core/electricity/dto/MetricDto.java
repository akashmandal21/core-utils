package com.stanzaliving.core.electricity.dto;


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
    private Double totalValue;
    private List<ValueDto> valueDtos;
    
}
