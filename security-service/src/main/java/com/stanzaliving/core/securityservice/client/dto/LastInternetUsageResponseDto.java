package com.stanzaliving.core.securityservice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LastInternetUsageResponseDto {

    private LocalDate lastUsageDate;
    private String propertyId;
    private String userId;
}