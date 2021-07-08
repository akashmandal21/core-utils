package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerResidenceMappingMigrationDTO {

    @JsonSetter(value = "user_uuid")
    private String residentUuid;

    @JsonSetter(value = "user_code")
    private String residentCode;
}
