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

    private Set<LocalDate> present;

    private Set<LocalDate> absent;

    private Set<LocalDate> leaves;
}
