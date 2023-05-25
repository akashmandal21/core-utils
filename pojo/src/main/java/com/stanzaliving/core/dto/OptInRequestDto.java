package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.Source;
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

    @Builder.Default
    private Source optInSource = Source.SIGMA;

    @Valid
    @NotEmpty(message = "Plan Opt In Request List cannot be null or empty")
    List<PlanOptInRequestDto> planOptInRequestDtoList;
}
