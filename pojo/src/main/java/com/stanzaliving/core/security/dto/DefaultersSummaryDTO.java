package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultersSummaryDTO {

    private Long pending = 0L;

    private Long taken = 0L;

    private Long total = 0L;
}
