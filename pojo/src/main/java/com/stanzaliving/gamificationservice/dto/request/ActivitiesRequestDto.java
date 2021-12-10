package com.stanzaliving.gamificationservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ActivitiesRequestDto{
    @NotBlank(message = "activity is Mandatory.")
    private String activity;

    private String description;

}
