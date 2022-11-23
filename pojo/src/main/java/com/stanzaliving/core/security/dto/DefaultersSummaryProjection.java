package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.ActionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultersSummaryProjection {

    private ActionStatus actionStatus;

    private Long statusCount = 0L;
}
