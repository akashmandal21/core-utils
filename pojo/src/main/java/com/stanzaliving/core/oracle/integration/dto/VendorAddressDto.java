package com.stanzaliving.core.oracle.integration.dto;

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
public class VendorAddressDto {

    @NotNull
    @JsonProperty("addressee")
    private String addressee;  //set

    @NotNull
    @JsonProperty("addr1")
    private String addr1;  //set

    @JsonProperty("addr2")
    private String addr2;  //set

    @JsonProperty("addrephone")
    private String addrephone;

    @NotNull
    @JsonProperty("country")
    private String country;  //set

    @NotNull
    @JsonProperty("state")
    private String state;  //set

    @NotNull
    @JsonProperty("city")
    private String city;  //set

    @NotNull
    @JsonProperty("zip")
    private String pincode;  //set

}
