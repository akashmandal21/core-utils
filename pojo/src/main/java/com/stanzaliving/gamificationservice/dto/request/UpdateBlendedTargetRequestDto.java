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
public class UpdateBlendedTargetRequestDto {

    @NotNull(
            message = "BlendedTarget Id is mandatory to update"
    )
    private String uuid;

    private String cluster;

    private String mmLead;

    private String city;

    private String zone;

    private String weightTarget;

    private String preBooking;

    private String fullBooking;

}
