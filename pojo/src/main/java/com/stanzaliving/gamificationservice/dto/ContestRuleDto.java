package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.gamificationservice.enums.PointFrequencyEnum;
import com.stanzaliving.gamificationservice.enums.RuleFunctionEnum;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class ContestRuleDto {

    private String ruleNo;

    private String ruleFunction;

    private String ruleCondition;

    private String contestStyle;

    private List<InputFieldsDto> inputFieldList;

    private List<TargetMultiplierDto> targetMultiplierList;

    private List<ActivityPointsDto> activityPointsList;

    private List<MinimumQualifierDto> minimumQualifierList;

    private int redeemablePoints;

    private int leaderBoardRank;

    private int leaderBoardPoints;

    private int pointsAwarded;

    private List<String> ruleCompleteList;

    private int countOfRewards;

    private String pointFrequency;

    private Date startDate;

    private Date endDate;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private String contestUuid;

    private String uuid;

}
