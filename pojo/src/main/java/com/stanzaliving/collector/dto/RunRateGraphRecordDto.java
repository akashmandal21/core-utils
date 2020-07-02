package com.stanzaliving.collector.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RunRateGraphRecordDto {
    Double pendingAmount = 0d;
    Double payableAmount = 0d;
    LocalDate date;
}
