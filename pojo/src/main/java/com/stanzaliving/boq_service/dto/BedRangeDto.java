package com.stanzaliving.boq_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BedRangeDto {
    @Builder.Default
    private Long fromBedCount = 0L;

    @Builder.Default
    private Long toBedCount = 0L;
}
