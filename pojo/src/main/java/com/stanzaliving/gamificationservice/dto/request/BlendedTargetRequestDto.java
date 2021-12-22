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
public class BlendedTargetRequestDto {
    @NotBlank(message = "SaName is Mandatory.")
    private String saName;

    private String cluster;

    private String city;

    private String zone;

    private String clusterManager;

    private String preBooking;

    private String fullBooking;

    private String weightTarget;

}
