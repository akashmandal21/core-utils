package com.stanzaliving.gamificationservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserActivitiesResponseDto extends AbstractDto {
    private String userUuid;

    private Date activityTime;

    private String activityUuid;

}
