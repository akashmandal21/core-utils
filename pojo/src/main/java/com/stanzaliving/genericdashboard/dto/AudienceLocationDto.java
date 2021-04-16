package com.stanzaliving.genericdashboard.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AudienceLocationDto {

    private List<String> city;

    private List<String> microMarket;

    private List<String> residence;
}