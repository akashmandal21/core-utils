package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RewardsResponseDto extends AbstractDto {
    private String name;

    private String employeeCode;

    private String emailId;

    private String location;

    private int bonusPoints;
}
