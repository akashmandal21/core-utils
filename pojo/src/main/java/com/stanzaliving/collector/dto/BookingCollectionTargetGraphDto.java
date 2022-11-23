package com.stanzaliving.collector.dto;

import com.stanzaliving.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCollectionTargetGraphDto {
    Double targetAmount = 0d;

    @Builder.Default
    Double collectionAmount = 0d;

    LocalDate date;
}
