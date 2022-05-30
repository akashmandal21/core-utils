package com.stanzaliving.core.security.dto;

import java.util.List;

import com.stanzaliving.internet.dto.UserLastUsageDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LastQrScanAndInternetUsageResponseDto {
   
	private List<LastQrScanResponseDataDto> lastQrScanResponseDto;
	private List<UserLastUsageDetailsDto> lastInternetUsage;


}
