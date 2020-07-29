package com.stanzaliving.collector.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RunRateGraphRecordDto {
    @Builder.Default
    Double currentPayableAmount = 0d;
    @Builder.Default
    Double pastPayableAmount = 0d;
    @Builder.Default
    Double currentPendingAmount = 0d;
    @Builder.Default
    Double pastPendingAmount = 0d;
    @Builder.Default
    Double surplusTransactionAmount = 0d;
    @Builder.Default
    Double pastTransactionAmount = 0d;
    @Builder.Default
    Double currentTransactionAmount = 0d;
    LocalDate date;
}
