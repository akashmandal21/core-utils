package com.stanzaliving.collector.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class ResidenceActionTrackerDto extends UserRentAggregationDto {
    String planOfAction;
    LocalDate nextFollowupDate;

}
