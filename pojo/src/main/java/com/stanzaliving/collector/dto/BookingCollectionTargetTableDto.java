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
public class BookingCollectionTargetTableDto extends RecordDto {
    String bookingUuid;
    @Builder.Default
    Double targetAmount = 0d;
    @Builder.Default
    Double collectionAmount = 0d;

    @Builder.Default
    Double currDateCollection = 0d;
    @Builder.Default
    Double tMinusOneCollection = 0d;
    @Builder.Default
    Double tMinusTwoCollection = 0d;
    @Builder.Default
    Double tMinusThreeCollection = 0d;
    @Builder.Default
    Double l7DayAvgCollection = 0d;
    
}
