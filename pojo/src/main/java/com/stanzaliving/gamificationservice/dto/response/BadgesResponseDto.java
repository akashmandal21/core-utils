package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.gamificationservice.enums.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BadgesResponseDto {
    private String uuid;

    private String badgesName;

    private String description;

    private String type;

    private BadgeCriteria badgeCriteria;

    private PointCondition pointCondition;

    private PointFrequency pointFrequency;

    private int pointsValue;

    private BadgeTarget badgeTarget;

    private TargetCondition targetCondition;

    private int targetValue;

    private String badgeType;

    private List<String> contests = new ArrayList<>();

    private String profilePhotoUrl;

    private int reward;

    private int noOfTimeBadgeEarnByUser;

    private String badgeLable;

    private String earnedOn;

    private String contestUuid;

    private int badgeTotal;

    private int badgeProgress;

}
