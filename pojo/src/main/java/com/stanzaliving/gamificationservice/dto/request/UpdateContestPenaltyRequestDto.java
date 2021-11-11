package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateContestPenaltyRequestDto {
    @NotNull(
            message = "ContestPenalty Id is mandatory to update"
    )
    private String uuid;

    private String contestTitle;

    private String associateName;

    private String description;

    private int penaltyPoints;

}
