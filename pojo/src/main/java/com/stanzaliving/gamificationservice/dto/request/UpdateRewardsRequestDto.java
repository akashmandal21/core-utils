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
public class UpdateRewardsRequestDto {
    @NotNull(
            message = "Rewards Id is mandatory to update"
    )
    private String uuid;

    private String name;

    private String employeeCode;

    private String emailId;

    private String location;

    private int bonusPoints;

    private int pointsScored;
}
