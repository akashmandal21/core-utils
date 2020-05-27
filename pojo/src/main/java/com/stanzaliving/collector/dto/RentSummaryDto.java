package com.stanzaliving.collector.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RentSummaryDto {
    @Builder.Default
    Double payableAmount = 0d;
    @Builder.Default
    Double pendingAmount = 0d;
    @Builder.Default
    Double arrearsAmount = 0d;
    @Builder.Default
    Double totalPendingAmount = 0d;

    @Builder.Default
    Integer payableCount = 0;
    @Builder.Default
    Integer pendingCount = 0;
    @Builder.Default
    Integer arrearsCount = 0;
    @Builder.Default
    Integer totalPendingCount = 0;
}
