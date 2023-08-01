package com.stanzaliving.core.locationservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String locationId;

    private String name;

    private String type;

    @JsonIgnore
    private Geometry geometry;

    private Properties properties;

    private String locationCode;
}
