package com.stanzaliving.gamificationservice.dto.response;

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
public class WallOfFameContestResponseDto {

    private String contestUuid;

    private String contestName;

    private String contestType;

    @JsonProperty("winners")
    private List<WinnersContestResponseDto> winnersResponseDtoList;

}
