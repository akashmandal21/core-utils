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

    private RuleFunctionEnum ruleFunction;

    private String ruleCondition;

    private String contestStyle;

    private List<InputFieldsDto> inputField;

    private List<TargetMultiplierDto> targetMultiplier;

    private List<ActivityPointsDto> activityPoints;

    private MinimumQualifierDto minimumQualifier;

    private int redeemablePoints;

    private int leaderBoardPoints;

    private int pointsAwarded;

    private String ruleComplete;

    private int countOfRewards;

    private PointFrequencyEnum pointFrequency;

    private Date startDate;

    private Date endDate;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

}
