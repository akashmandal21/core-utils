package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceBedCountDto {

    private String bedType;
    private Long bedCount;
}
