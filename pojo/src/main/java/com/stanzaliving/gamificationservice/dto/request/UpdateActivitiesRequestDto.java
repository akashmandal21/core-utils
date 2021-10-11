package com.stanzaliving.gamificationservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateActivitiesRequestDto extends AbstractDto {
    @NotNull(
            message = "Activities Id is mandatory to update"
    )
    private String uuid;

    private String activities;

    private String description;

}
