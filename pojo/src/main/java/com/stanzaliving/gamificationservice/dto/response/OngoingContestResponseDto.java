package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OngoingContestResponseDto {

    private String contestUuid;
    private String contestMainBackgroundImage;
    private String contestLogo;
    private String contestName;
    private int userRank;
    private String userRankStatus;
    private int userPoints;
    private String userPointsStatus;
    private List<ContestTaskResponseDto> contestTasks;

}
