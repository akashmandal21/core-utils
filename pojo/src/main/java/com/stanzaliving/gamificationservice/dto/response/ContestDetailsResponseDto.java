package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContestDetailsResponseDto {

    @JsonProperty("contestTitle")
    private String contestTitle;
    @JsonProperty("contestType")
    private String contestType;
    @JsonProperty("contest_logo")
    private String contestLogo;
    @JsonProperty("contest_main_background_img")
    private String contestMainBackgroundImg;
    @JsonProperty("contest_message")
    private String contestMessage;
    @JsonProperty("contest_name")
    private String contestName;
    @JsonProperty("contest_task")
    private List<ContestTaskResponseDto> contestTask;
    @JsonProperty("contest_uuid")
    private String contestUuid;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("dateOfJoining")
    private String dateOfJoining;
    @JsonProperty("description")
    private String description;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("location")
    private List<String> location;
    @JsonProperty("my_point_status")
    private String myPointStatus;
    @JsonProperty("my_points")
    private int myPoints;
    @JsonProperty("my_rank")
    private int myRank;
    @JsonProperty("my_rank_status")
    private String myRankStatus;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("zone")
    private List<String> zone;

}
