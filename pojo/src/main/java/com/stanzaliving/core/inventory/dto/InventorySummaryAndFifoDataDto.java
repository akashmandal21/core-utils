package com.stanzaliving.core.inventory.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventorySummaryAndFifoDataDto {

    @CsvBindByName(column="ItemUuid")
    private String itemUuid;

    @CsvBindByName(column="LocationUuid")
    private String locationUuid;

    @CsvBindByName(column="SummaryQty")
    private BigDecimal summaryQty;

    @CsvBindByName(column = "FifoQty")
    private BigDecimal fifoQty;

    @CsvBindByName(column="Status")
    private Boolean status;


}
