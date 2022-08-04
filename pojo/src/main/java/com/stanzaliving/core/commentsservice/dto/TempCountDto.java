package com.stanzaliving.core.commentsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempCountDto {
    private String contextUuid;

    private String subContextUuid;

    private Long count;
}
