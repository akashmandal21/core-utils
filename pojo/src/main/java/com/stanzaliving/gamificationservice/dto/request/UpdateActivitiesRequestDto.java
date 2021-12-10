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
public class UpdateActivitiesRequestDto {
    @NotNull(
            message = "Activities Id is mandatory to update"
    )
    private String uuid;

    private String activity;

    private String description;

}
