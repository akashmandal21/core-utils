package com.stanzaliving.genericdashboard.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResidenceRatingDto {

    private String residenceRating;
    private String foodRating;

}
