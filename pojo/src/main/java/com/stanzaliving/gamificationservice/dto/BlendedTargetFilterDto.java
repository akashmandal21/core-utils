package com.stanzaliving.gamificationservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class BlendedTargetFilterDto {
    private String saName;

    private String city;

    private String cluster;
}
