package com.stanzaliving.core.inventory.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SwimInventorySyncDto {

    private String addressUuid;
    private Map<String, ItemStatusDetail> itemStatusDetailMap;

    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ItemStatusDetail {
        private String itemCode;
        private BigDecimal pieceDamaged;
        private BigDecimal cartonDamaged;
        private BigDecimal qcChk;
        private BigDecimal rePck;
        private BigDecimal okQty;
        private BigDecimal diff;
        private boolean add;
    }
}
