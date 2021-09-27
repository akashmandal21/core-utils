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
public class ResidentProfessionalDetailsMigrationData {
    @JsonSetter(value = "user_id")
    private String residentUuid;

    @JsonSetter(value = "resident_type")
    private String residentType;
}
