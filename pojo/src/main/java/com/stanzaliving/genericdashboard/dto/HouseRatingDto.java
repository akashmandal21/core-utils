package com.stanzaliving.genericdashboard.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class HouseRatingDto {

    private List<String> houseRating;
    private String residenceUuid;

}
