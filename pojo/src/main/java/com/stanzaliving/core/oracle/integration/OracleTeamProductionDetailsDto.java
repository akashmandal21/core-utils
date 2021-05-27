package com.stanzaliving.core.oracle.integration;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
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
