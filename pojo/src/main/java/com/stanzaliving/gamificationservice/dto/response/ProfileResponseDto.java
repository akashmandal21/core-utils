package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.dto.UserBadgesDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProfileResponseDto {

    @JsonProperty("user_img")
    private String userImage;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("user_city")
    private String userCity;

    @JsonProperty("user_designation")
    private String userDesignation;

    @JsonProperty("user_current_points")
    private String userCurrentPoints;

    @JsonProperty("user_current_points_status")
    private String userCurrentPointsStatus;

    @JsonProperty("user_lifetime_points")
    private String userLifeTimePoints;

    @JsonProperty("user_lifetime_points_status")
    private String userLifeTimePointsStatus;

    @JsonProperty("user_badges_list")
    private List<UserBadgesDto> userBadgesList;

    @JsonProperty("user_contest_subtask_history")
    private List<MonthDataResponseDto> userContestSubTaskHistory;

    @JsonProperty("challenges_banner_images")
    private List<BannerResponseDto> bannerResponseDtoList;


}
