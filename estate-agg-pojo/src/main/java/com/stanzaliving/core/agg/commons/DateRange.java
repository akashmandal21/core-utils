package com.stanzaliving.core.agg.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateRange {
    private Long startDate;
    private Long endDate;
}
