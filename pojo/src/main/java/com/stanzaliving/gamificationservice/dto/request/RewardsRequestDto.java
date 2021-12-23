package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RewardsRequestDto {
    @NotBlank(message = "Name is Mandatory.")
    private String name;

    @NotBlank(message = "EmployeeCode is Mandatory.")
    private String employeeCode;

    @Email(message = "EmailId is Mandatory.")
    private String emailId;

    @NotBlank(message = "Location is Mandatory.")
    private String location;

    @NotNull(message = "BonusPoints is Mandatory.")
    private int bonusPoints;

    @NotNull(message = "PointsScored is Mandatory.")
    private int pointsScored;

    @NotNull(message = "UserId is Mandatory.")
    private String userId;
}
