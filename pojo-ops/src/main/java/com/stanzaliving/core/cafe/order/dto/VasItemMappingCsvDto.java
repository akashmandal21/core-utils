package com.stanzaliving.core.cafe.order.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class VasItemMappingCsvDto {
    @CsvBindByName(column = "Item Id")
    private String itemId;

    @CsvBindByName(column = "Vas Item Id")
    private String vasItemId;
}
