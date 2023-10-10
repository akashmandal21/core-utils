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
public class Properties implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nearbyArea;

    private String type;

    private String id;

    private String uuid;
}
