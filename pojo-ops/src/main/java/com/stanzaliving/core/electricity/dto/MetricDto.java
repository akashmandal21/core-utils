package com.stanzaliving.core.electricity.dto;


import java.io.Serializable;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MetricDto implements Serializable {
    private String categoryName;
    private Double totalValue;
    private List<ValueDto> valueDtos;
    
}
