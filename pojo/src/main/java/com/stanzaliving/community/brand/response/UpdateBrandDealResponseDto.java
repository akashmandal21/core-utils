package com.stanzaliving.community.brand.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBrandDealResponseDto {
    
    private String message;
    private String dealUuid;
}
