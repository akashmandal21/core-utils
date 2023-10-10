package com.stanzaliving.core.securityservice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternetAndFoodScanDataResponseDto {

    private List<LastInternetUsageResponseDto> lastInternetUsage;
    private List<LastFoodScanResponseDto> lastQrScanResponseDto;
}
