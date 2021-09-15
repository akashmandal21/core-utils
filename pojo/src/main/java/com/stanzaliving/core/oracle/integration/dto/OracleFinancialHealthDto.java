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
public class OracleFinancialHealthDto {

    @JsonProperty("financialYear")
    private String financialYear;  //set

    @JsonProperty("annualTurnover")
    private String annualTurnover;  //set

    @JsonProperty("turnoverDocument")
    private String turnoverDocument;  //set

}
