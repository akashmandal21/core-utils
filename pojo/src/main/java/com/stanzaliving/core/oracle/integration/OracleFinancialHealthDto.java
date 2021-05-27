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
public class OracleFinancialHealthDto {

    @JsonProperty("financialYear")
    private String financialYear;  //set

    @JsonProperty("annualTurnover")
    private String annualTurnover;  //set

    @JsonProperty("turnoverDocument")
    private String turnoverDocument;  //set

}
