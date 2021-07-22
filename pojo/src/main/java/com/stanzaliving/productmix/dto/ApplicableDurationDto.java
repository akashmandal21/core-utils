package com.stanzaliving.productmix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicableDurationDto {
    private LocalDate fromDate;

    private LocalDate toDate;
}
