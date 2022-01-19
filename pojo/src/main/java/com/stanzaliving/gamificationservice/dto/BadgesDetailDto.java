package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadgesDetailDto {

    @JsonProperty("badge_name")
    private String badgeName;

    @JsonProperty("badge_lable")
    private String badgeLable;

    @JsonProperty("badge_points")
    private int badgePoints;

    @JsonProperty("badge_progress")
    private int badgeProgress;

    @JsonProperty("badge_total")
    private int badgeTotal;

    @JsonProperty("badges_earned")
    private int badgeEarned;

    @JsonProperty("badge_list")
    private List<BadgesListDto> badgesDtoList;
}
