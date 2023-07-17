package com.stanzaliving.core.deal.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealKycResponseDto extends DealKycRequestDto {

    private String fileUrl;

    private String userId;

}
