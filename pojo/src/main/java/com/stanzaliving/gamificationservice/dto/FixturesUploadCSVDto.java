package com.stanzaliving.gamificationservice.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor


public class FixturesUploadCSVDto {

    @CsvBindByPosition(position = 0)
    @CsvBindByName(column = "start_date")
    private String startDate;

    @CsvBindByPosition(position = 1)
    @CsvBindByName(column = "end_date")
    private String endDate;

    @CsvBindByPosition(position = 2)
    @CsvBindByName(column = "teams")
    private String teams;

}
