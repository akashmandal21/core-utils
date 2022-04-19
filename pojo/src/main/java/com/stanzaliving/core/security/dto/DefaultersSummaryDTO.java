package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DefaultersSummaryDTO {

    @Builder.Default
    private Long pending = 0L;

    @Builder.Default
    private Long taken = 0L;

    @Builder.Default
    private Long total = 0L;
}
