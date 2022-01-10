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
public class ReversePointUploadCSVDto {

    @CsvBindByPosition(position = 0)
    @CsvBindByName(column = "reverse_points")
    private int reversePoints;

    @CsvBindByPosition(position = 1)
    @CsvBindByName(column = "description")
    private String description;
}
