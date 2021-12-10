package com.stanzaliving.gamificationservice.dto.request;

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
public class BlendedTargetUploadCsvDto {

    @CsvBindByName(
            column = "SA Name"
    )
    @CsvBindByPosition(position = 0)
    private String saName;


    @CsvBindByName(
            column = "Cluster"
    )
    @CsvBindByPosition(position = 1)
    private String cluster;

    @CsvBindByName(
            column = "MM Lead"
    )
    @CsvBindByPosition(position = 2)
    private String mmLead;


    @CsvBindByName(
            column = "City"
    )
    @CsvBindByPosition(position = 3)
    private String city;

    @CsvBindByName(
            column = "Zone"
    )
    @CsvBindByPosition(position = 4)
    private String zone;

    @CsvBindByName(
            column = "Weighted Target"
    )
    @CsvBindByPosition(position = 5)
    private String weightTarget;

    @CsvBindByName(
            column = "PreBooking"
    )
    @CsvBindByPosition(position = 6)
    private String preBooking;

    @CsvBindByName(
            column = "Full booking"
    )
    @CsvBindByPosition(position = 7)
    private String fullBooking;


}
