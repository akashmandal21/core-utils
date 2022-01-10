package com.stanzaliving.gamificationservice.dto.mock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OnGoingContestListDto {

  @JsonProperty("contest_uuid")
  private String contestUuid;

  @JsonProperty("contest_main_background_image")
  private String contestMainBackgroundImage;

  @JsonProperty("contest_logo")
  private String contestLogo;

  @JsonProperty("contest_name")
  private String contestName;

  @JsonProperty("my_rank")
  private int myRank;

  @JsonProperty("user_rank_status")
  private String userRankStatus;

  @JsonProperty("my_points")
  private int  myPoints;

  @JsonProperty("user_points_status")
  private String userPointsStatus;

  @JsonProperty("contest_task")
  private List<ContestTaskDto>contestTask;

  @JsonProperty("contest_message")
  private String contestMessage;
}
