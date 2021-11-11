package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RewardsResponseDto {
    private String uuid;

    private String name;

    private String employeeCode;

    private String emailId;

    private String location;

    private int bonusPoints;
}
