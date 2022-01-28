package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestParticipantUserResponseDto implements Comparable<ContestParticipantUserResponseDto>{

    @JsonProperty("user_badges_list")
    private List<UserBadgesResponseDto> badgesList;

    @JsonProperty("over_all_score_in_percentage")
    private String overallScore;

    @JsonProperty("rank")
    private int myRank;

    @JsonProperty("rank_status")
    private String myRankStatus;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("user_profile_image")
    private String userImage;

    @JsonProperty("user_city")
    private String userCluster;

    @JsonProperty("user_points")
    private int userPoints;

    @JsonProperty("user_progress")
    private String userProgress;

    @JsonProperty("user_card_bg_color")
    private String userCardBgColor;

    @Override
    public int compareTo(ContestParticipantUserResponseDto e) {
        return Integer.valueOf(this.userPoints).compareTo(Integer.valueOf(e.userPoints));
    }

}
