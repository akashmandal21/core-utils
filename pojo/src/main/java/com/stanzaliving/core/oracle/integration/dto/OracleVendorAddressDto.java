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
public class OracleVendorAddressDto {

    @NotNull
    @JsonProperty("defaultbilling")
    private String defaultbilling;  //set

    @NotNull
    @JsonProperty("defaultshipping")
    private String defaultshipping;  //set

    @JsonProperty("addressbookaddress")
    VendorAddressDto addressbookaddress; //set

}
