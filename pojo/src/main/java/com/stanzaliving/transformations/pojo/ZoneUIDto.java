package com.stanzaliving.transformations.pojo;


import com.stanzaliving.transformations.enums.TimeZone;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ZoneUIDto {

    private String uuid;

    private long id;

    @NotNull
    private String zoneName;

    @NotNull
    private String countryName;

    private boolean status;

    private long countryId;
}