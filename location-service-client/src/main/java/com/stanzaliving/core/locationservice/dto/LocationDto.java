package com.stanzaliving.core.locationservice.dto;

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

    private String name;

    private String locationId;

    private String locationCode;
}
