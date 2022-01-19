package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadgesListDto {

    @JsonProperty("badge_points")
    private int badgePoints;

    @JsonProperty("badge_image")
    private String badgeImage;

    @JsonProperty("earned_on")
    private String earnedOn;

    @JsonProperty("contest_name")
    private String contestName;

}
