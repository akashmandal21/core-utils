package com.stanzaliving.core.dto;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanRequestDto {

    List<PlanOptInRequestDto> planOptInRequestDtoList;

    List<PlanOptOutRequestDto> planOptOutRequestDtoList;

}
