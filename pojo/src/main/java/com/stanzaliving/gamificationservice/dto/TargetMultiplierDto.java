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

public class TargetMultiplierDto {

    private String ruleNo;

    private String targetMultiplierBooking;

    private String targetMultiplierPreBooking;

    private int targetMultiplierPreBookingMinimum;

    private int targetMultiplierPreBookingMaximum;

    private int preBookingMultiplierPoints;

    private int targetMultiplierBookingMinimum;

    private int targetMultiplierBookingMaximum;

    private int bookingMultiplierPoints;

    private String uuid;

    private String contestRuleUuid;
}
