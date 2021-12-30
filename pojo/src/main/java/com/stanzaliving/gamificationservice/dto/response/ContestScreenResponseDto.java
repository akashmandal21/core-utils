package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.dto.OnGoingContestDto;
import com.stanzaliving.gamificationservice.dto.UserBadgesDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestScreenResponseDto {

    private String uuid;

    @JsonProperty("user_profile_pic")
    private String userImage;

    @JsonProperty("user_status")
    private boolean userStatus;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("greeting_msg")
    private String greetingMsg;

    @JsonProperty("user_city")
    private String userCity;

    @JsonProperty("user_points")
    private String userPoints;

    @JsonProperty("user_points_status")
    private String userPointsStatus;

    @JsonProperty("user_rank")
    private String userRank;

    @JsonProperty("user_rank_status")
    private String userRankStatus;

    @JsonProperty("no_of_contest_show")
    private int noOfContestShow;

    @JsonProperty("user_badges")
    private List<UserBadgesDto> userBadgesList;

    @JsonProperty("ongoing_contest_list")
    private List<OnGoingContestDto> ongoingContestList;

    @JsonProperty("banner_images")
    private List<BannerResponseDto> bannerResponseDtoList;


}
