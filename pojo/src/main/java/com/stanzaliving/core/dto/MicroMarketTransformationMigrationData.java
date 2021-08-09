package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MicroMarketTransformationMigrationData {
    @JsonSetter(value = "uuid")
    private String microMarketId;

    @JsonSetter(value = "micromarket_name")
    private String microMarketName;
}
