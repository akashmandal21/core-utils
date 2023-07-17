package com.stanzaliving.core.commercialcode.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCodeResponseDto {
    private String title;
    private Object data;
}
