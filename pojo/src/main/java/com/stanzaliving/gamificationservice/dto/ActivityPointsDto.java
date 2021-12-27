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
public class ActivityPointsDto {

    private String ruleNo;

    private String  activityPointsPreBooking;

    private String activityPointsBooking;

    private String  activityPointsPreBookingCondition;

    private String activityPointsBookingCondition;

    private int activityPointsPreBookingValue;

    private int activityPointsBookingValue;
}
