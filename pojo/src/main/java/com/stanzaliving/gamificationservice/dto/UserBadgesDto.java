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
public class UserBadgesDto {

    @JsonProperty("badge_image")
    private String badgeImage;

    @JsonProperty("badge_background_image")
    private String badgeBackgroundImage;

    @JsonProperty("number_of_time_badge_earn_by_user")
    private int noOfTimeBadgeEarnByUser;

    @JsonProperty("badge_lable")
    private String badgeLable;
}
