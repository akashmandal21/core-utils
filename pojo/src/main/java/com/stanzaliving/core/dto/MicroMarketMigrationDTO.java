package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MicroMarketMigrationDTO {

    @JsonSetter(value = "MICROMARKET_ID")
    private Integer microMarketId;

    @JsonSetter(value = "NAME")
    private String microMarketName;
}
