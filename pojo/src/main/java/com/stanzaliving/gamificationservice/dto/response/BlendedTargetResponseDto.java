package com.stanzaliving.gamificationservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlendedTargetResponseDto {
    private String uuid;

    private String saName;

    private String cluster;

    private String mmLead;

    private String city;

    private String zone;

    private String weightTarget;

    private String preBooking;

    private String fullBooking;

    private String url;

    private int noOfUsers;
}
