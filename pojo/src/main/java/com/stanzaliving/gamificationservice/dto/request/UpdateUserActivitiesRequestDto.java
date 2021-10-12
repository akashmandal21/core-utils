package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.Date;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserActivitiesRequestDto extends AbstractDto {
    @NotNull(
            message = "UserActivities Id is mandatory to update"
    )
    private String uuid;

    private String userUuid;

    private Date activityTime;

    private String activityUuid;

}
