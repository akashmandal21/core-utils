package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanRequestDto {

    List<PlanOptInRequestDto> planOptInRequestDtoList;

    List<PlanOptOutRequestDto> planOptOutRequestDtoList;

}
