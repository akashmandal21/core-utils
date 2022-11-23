package com.stanzaliving.core.security.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.stanzaliving.core.security.enums.AttendanceStatus;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidentDateDTO {

    private LocalDate date;

    private AttendanceStatus status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentDateDTO that = (ResidentDateDTO) o;
        return Objects.equals(date, that.date);
    }
    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
