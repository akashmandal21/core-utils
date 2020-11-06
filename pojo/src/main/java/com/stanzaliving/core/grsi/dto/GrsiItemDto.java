package com.stanzaliving.core.grsi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GrsiItemDto {

    private String itemUuid;
    private String batchId;
    private LocalDate expiryDate;
    private BigDecimal effectivePrice;
    private BigDecimal quantity;

}
