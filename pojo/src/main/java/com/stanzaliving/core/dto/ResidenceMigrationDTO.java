package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceMigrationDTO {

    @JsonSetter(value = "MICROMARKET_ID")
    private Integer microMarketId;

    @JsonSetter(value = "RESIDENCE_ID")
    private Integer residenceId;

    @JsonSetter(value = "NAME")
    private String residenceName;

    @JsonSetter(value = "RESIDENCE_ADDRESS_ID")
    private Integer currentAddressId;
}
