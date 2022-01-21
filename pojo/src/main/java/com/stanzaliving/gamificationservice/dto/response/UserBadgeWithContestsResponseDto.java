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
public class UserBadgeWithContestsResponseDto {

    private String profileUuid;
    private String badgeUuid;
    private String badgeName;
    private int totalPoints;
    private int percentageOfTaskCompleted;
    private List<UserBadgeInContestResponseDto> listOfContestsWithBadge;

}
