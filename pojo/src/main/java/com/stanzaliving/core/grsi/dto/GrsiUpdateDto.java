package com.stanzaliving.core.grsi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GrsiUpdateDto {

    private String potoUuid;
    private BigDecimal grsiPct;
    private boolean grsiCompleted;
    private Date updatedAt;
}
