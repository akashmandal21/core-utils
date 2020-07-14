package com.stanzaliving.collector.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCollectionDto {
    String bookingUuid;
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
