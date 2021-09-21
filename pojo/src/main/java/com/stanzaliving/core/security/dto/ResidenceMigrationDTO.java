package com.stanzaliving.core.security.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMigrationDTO {

    @JsonSetter(value = "MICROMARKET_ID")
    private Integer microMarketId;

    @JsonSetter(value = "RESIDENCE_ID")
    private Integer residenceId;

    @JsonSetter(value = "NAME")
    private String residenceName;
}
