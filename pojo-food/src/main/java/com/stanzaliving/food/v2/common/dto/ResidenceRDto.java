package com.stanzaliving.food.v2.common.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ResidenceRDto implements Serializable {
    private String residenceId;
    private String name;
    private String mmId;
    private String mmName;
    private String cityId;
    private String cityName;
}
