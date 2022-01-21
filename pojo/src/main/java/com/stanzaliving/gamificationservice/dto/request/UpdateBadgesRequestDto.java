package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.gamificationservice.enums.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBadgesRequestDto {
    @NotNull(
            message = "Badges Id is mandatory to update"
    )
    private String uuid;

    private String badgesName;

    private String description;

    private String type;

    private BadgeCriteria badgeCriteria;

    private PointCondition pointCondition;

    private Integer pointsValue;

    private BadgeTarget badgeTarget;

    private TargetCondition targetCondition;

    private Integer targetValue;

    private String badgeType;

    private List<String> contests = new ArrayList<>();

    private String profilePhotoUrl;

    private Integer reward;

    private Integer noOfTimeBadgeEarnByUser;

    private String badgeLable;

    private Integer badgeTotal;

    private Integer badgeProgress;

    private String earnedOn;

    private String contestUuid;

}
