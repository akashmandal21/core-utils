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
    Double l7DayCollection = 0d;
    @Builder.Default
    Double l30DayCollection = 0d;
    @Builder.Default
    Double tilltMinusThreeCollection = 0d;
    @Builder.Default
    Double tillL7DayCollection = 0d;
    @Builder.Default
    Double tillL30DayCollection = 0d;
    @Builder.Default
    Double negativeCollection = 0d;
}
