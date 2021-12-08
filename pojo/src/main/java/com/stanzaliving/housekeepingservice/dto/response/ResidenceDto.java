package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class ResidenceDto {

    private String names;

    private int ratings;

    private int rooms;

    private double hps;

    private int issues;

    private int delighted;

    private int disgusted;

    private String vendorName;
}
