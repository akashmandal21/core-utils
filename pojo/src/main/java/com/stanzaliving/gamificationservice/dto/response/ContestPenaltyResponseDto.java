package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestPenaltyResponseDto {
    private String uuid;

    private String contestTitle;

    private String associateName;

    private String city;

    private String cluster;

    private String zone;

    private String description;

    private int penaltyPoints;

    private boolean isPenalty;
}
