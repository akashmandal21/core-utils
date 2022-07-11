package com.stanzaliving.productmix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicableDurationDto {

    @NotNull(message = "Applicable from date cannot be null")
    private Long fromDate;

    @NotNull(message = "Applicable to date cannot be null")
    private Long toDate;
}
