package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.gamificationservice.dto.ContestDto;
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
public class ContestTeamResponseDto {

    @JsonProperty("contest")
    private List<ContestDto> contestList;

    @JsonProperty("teams")
    private List<TeamsResponseDto> teamsList;

}
