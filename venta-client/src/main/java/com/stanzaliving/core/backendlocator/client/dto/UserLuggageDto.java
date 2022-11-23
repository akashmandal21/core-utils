package com.stanzaliving.core.backendlocator.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLuggageDto {
    private String studentId;
    private String flagType;

    public int hashCode() {
        return studentId.getBytes().length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLuggageDto that = (UserLuggageDto) o;
        return Objects.equals(studentId, that.studentId);
    }
}
