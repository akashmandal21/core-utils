package com.stanzaliving.internet.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLastUsageDetailsDto {
    private String propertyId;

    private String userId;

    private LocalDate lastUsageDate;
}
