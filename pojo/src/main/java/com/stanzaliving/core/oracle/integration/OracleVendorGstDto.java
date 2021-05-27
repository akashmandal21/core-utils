package com.stanzaliving.core.oracle.integration;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

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
