package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserActivitiesRequestDto {
    @NotBlank(message = "userId cannot be empty")
    private String userUuid;

    private Date activityTime;

    @NotBlank(message = "activityId cannot be empty")
    private String activityUuid;

}
