package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.enums.BadgeType;
import com.stanzaliving.gamificationservice.enums.Type;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserBadgeInContestResponseDto {
    @JsonProperty("contest_name")
    private String contestName;
    @JsonProperty("badge_points")
    private int badgePointsInContest;
    @JsonProperty("badge_image")
    private String image;
    @JsonProperty("earned_on")
    private String lastActivityDate;

}
