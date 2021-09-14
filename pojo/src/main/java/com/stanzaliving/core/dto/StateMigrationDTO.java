package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateMigrationDTO {
    @JsonSetter(value = "STATE_ID")
    private Integer stateId;

    @JsonSetter(value = "NAME")
    private String stateName;
}
