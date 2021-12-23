package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ContestPenaltyRequestDto {
    @NotBlank(message = "ContestTitle is Mandatory.")
    private String contestTitle;

    @NotBlank(message = "AssociateName is Mandatory.")
    private String associateName;

    private String city;

    private String cluster;

    private String zone;

    private String description;

    @NotNull(message = "PenaltyPoints is Mandatory.")
    private int penaltyPoints;

}
