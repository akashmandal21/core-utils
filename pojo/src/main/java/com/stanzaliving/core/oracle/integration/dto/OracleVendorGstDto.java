package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleVendorGstDto {

    @NotNull
    @JsonProperty("nexuscountry")
    private String nexuscountry;  //set

    @NotNull
    @JsonProperty("nexusstate")
    private String nexusstate;  //set

    @NotNull
    @JsonProperty("taxregistrationnumber")
    private String taxregistrationnumber;  //set

    @NotNull
    @JsonProperty("exempt")
    private String exempt;  //set

    @JsonProperty("address")
    private String address;  //set

    @JsonProperty("default")
    private String Default;  //set

}
