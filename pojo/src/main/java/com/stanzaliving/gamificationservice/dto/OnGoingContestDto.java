package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.dto.response.ContestTaskResponseDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OnGoingContestDto {

    @JsonProperty("contest_uuid")
    private String contestUuid;

    @JsonProperty("contest_main_background_img")
    private String contestMainBackgroundImg;

    @JsonProperty("contest_logo")
    private String contestLogo;

    @JsonProperty("contest_name")
    private String contestName;

    @JsonProperty("my_rank")
    private String myRank;

    @JsonProperty("user_point_status")
    private String userPointsStatus;

    @JsonProperty("my_points")
    private String myPoints;

    @JsonProperty("user_rank_status")
    private String userRankStatus;

    @JsonProperty("contest_task")
    private List<ContestTaskResponseDto> contestTaskList;

    @JsonProperty("contest_message")
    private String contestMessage;


}
