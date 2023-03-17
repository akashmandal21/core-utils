package com.stanzaliving.core.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OptInRequestDto {

    @Valid
    @NotEmpty(message = "Plan Opt In Request List cannot be null or empty")
    List<PlanOptInRequestDto> planOptInRequestDtoList;
}
