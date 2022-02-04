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
public class OngoingContestScreenResponseDto {

    private String uuid;

    @JsonProperty("contest_logo")
    private String contestLogo;

    @JsonProperty("contestBackgroudImage")
    private String contestMainBackgroundImg;

    @JsonProperty("contest_name")
    private String contestName;

    @JsonProperty("contest_leaderboard_quick_filter")
    private List<FilterResponseDto> quickFilterResponseDtoList;

    @JsonProperty("leaderboard_list_as_per_contest")
    private List<ContestParticipantUserResponseDto> contestusers;

    @JsonProperty("contest_details")
    private OngoingContestDetailsResponseDto contestDetails;

}
