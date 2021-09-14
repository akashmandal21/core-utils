package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceTransformationMigrationData {
    @JsonSetter(value = "uuid")
    private String residenceUuid;

    @JsonSetter(value = "residence_name")
    private String residenceName;
}
