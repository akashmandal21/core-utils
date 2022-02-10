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

    @JsonProperty("badgeslist")
    private List<UserBadgesResponseDto> badgesList;

    @JsonProperty("over_all_score_in_percentage")
    private String overallScore;

    @JsonProperty("userRank")
    private String myRank;

    @JsonProperty("rank_status")
    private String myRankStatus;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("userImage")
    private String userImage;

    @JsonProperty("userCity")
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
