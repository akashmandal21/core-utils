package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourResponseDto {
    private String primaryReferenceUuid;
    private String referenceUuid;
    private AccessLevel accessLevel;
    private LocalTime StartTime;
    private LocalTime EndTime;
    private LocalTime BufferTime;
}
