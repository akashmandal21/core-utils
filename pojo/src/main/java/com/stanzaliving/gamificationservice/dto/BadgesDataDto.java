package com.stanzaliving.gamificationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BadgesDataDto {

    private String badgesName;

    private String badgeLable;

    private int pointsValue;

    private int noOfTimeBadgeEarnByUser;

    private int badgeProgress;

    private int badgeTotal;


}
