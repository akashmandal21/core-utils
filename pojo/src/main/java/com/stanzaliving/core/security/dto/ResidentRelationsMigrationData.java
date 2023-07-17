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
public class ResidentRelationsMigrationData {

    @JsonSetter(value = "mobile_number")
    private String mobileNumber;

    @JsonSetter(value = "email")
    private String email;

    @JsonSetter(value = "relation_type")
    private String relationType;

    @JsonSetter(value = "user_id")
    private String residentUuid;

    @JsonSetter(value = "full_name")
    private String fullName;
}
