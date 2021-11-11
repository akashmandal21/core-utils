package com.stanzaliving.gamificationservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserActivitiesResponseDto {
    private String uuid;

    private String userUuid;

    private Date activityTime;

    private String activityUuid;

}
