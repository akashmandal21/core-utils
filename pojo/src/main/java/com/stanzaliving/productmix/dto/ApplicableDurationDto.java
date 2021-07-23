package com.stanzaliving.productmix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicableDurationDto {

    @NotNull(message = "Applicable from date cannot be null")
    private LocalDate fromDate;

    @NotNull(message = "Applicable to date cannot be null")
    private LocalDate toDate;
}
