package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DateRangeDto {
    @Builder.Default
    private Long fromDate = 0L;

    @Builder.Default
    private Long toDate = 0L;
}
