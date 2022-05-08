package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupportHkRmTicketResponseDto {
    private String userId;
    private String residenceId;
	private boolean supportTicketRaised;
}
