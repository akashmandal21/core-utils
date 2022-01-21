package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.gamificationservice.enums.BadgeType;
import com.stanzaliving.gamificationservice.enums.Type;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserBadgeInContestResponseDto {

    private String profileUuid;

    private String contestUuid;

    private String badgeUuid;

    private String contestName;

    private int badgePointsInContest;

    private Date lastActivityDate;

}
