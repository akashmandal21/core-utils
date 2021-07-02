package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleTeamProductionDetailsDto {

    @JsonProperty("teamStrength")
    private String teamStrength;  //set

    @JsonProperty("teamProductionCapacity")
    private String teamProductionCapacity;  //set

    @JsonProperty("teamSpecialMachine")
    private String teamSpecialMachine;  //set

}
