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
public class OngoingContestListResponseDto {

    @JsonProperty("user_uuid")
    private String userUuid;
    @JsonProperty("ongoing_contest_list")
    private List<ContestDetailsResponseDto> ongoingContestList;
    @JsonProperty("past_contest_list")
    private List<ContestDetailsResponseDto> pastContestList;

}
