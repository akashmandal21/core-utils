package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceMonthDTO {
    // TODO:
    private List<LocalDate> present;

    private List<LocalDate> absent;

    private Set<LocalDate> leaves;
}
