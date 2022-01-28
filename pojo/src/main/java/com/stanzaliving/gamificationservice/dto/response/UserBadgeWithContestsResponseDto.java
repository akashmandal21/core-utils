package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserBadgeWithContestsResponseDto {

    @JsonProperty("badge_lable")
    private String badgeLabel;
    @JsonProperty("badge_name")
    private String badgeName;
    @JsonProperty("badge_points")
    private int badgePoints;
    @JsonProperty("badge_progress")
    private int badgeProgress;
    @JsonProperty("badge_total")
    private int badgeTotal;
    @JsonProperty("badges_earned")
    private int badgesEarned;
    @JsonProperty("badge_list")
    private List<UserBadgeInContestResponseDto> listOfContestsWithBadge;

}
