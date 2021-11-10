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
    private String contestTitle;

    private String associateName;

    private String description;

    private int penaltyPoints;

}
