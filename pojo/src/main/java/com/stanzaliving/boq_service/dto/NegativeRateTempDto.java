package com.stanzaliving.boq_service.dto;

import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NegativeRateTempDto {
    private String itemBoqUuid;

    private BoqStatus boqStatus;

    private BigDecimal quantity;

    private BigDecimal rate;

    private BigDecimal block;

    private Timestamp date;
}
