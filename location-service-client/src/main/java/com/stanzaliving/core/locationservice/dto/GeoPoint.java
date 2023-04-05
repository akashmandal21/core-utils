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
public class GeoPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    private double latitude;
    private double longitude;
}
