package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.gamificationservice.enums.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 11/24/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadgesDto {

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


}
