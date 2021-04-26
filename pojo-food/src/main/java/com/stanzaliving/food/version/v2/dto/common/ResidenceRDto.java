package com.stanzaliving.food.version.v2.dto.common;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
public class ResidenceRDto implements Serializable {
    private String residenceId;
    private String name;
    private String mmId;
    private String mmName;
    private String cityId;
    private String cityName;
}
