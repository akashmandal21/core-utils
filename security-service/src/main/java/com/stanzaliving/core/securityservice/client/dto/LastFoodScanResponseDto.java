package com.stanzaliving.core.securityservice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LastFoodScanResponseDto {

    private LocalDateTime foodScanLastDate;
    private String qrContextType;
    private String userId;

}