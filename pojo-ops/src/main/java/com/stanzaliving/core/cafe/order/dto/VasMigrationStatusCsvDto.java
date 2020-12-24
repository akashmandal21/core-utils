package com.stanzaliving.core.cafe.order.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class VasMigrationStatusCsvDto {
    @CsvBindByName(column = "Order Id")
    @CsvBindByPosition(position = 0)
    private String vasOrderId;

    @CsvBindByName(column = "Status")
    @CsvBindByPosition(position = 1)
    private String status;

    @CsvBindByPosition(position = 2)
    @CsvBindByName(column = "Message")
    private String message;
}
