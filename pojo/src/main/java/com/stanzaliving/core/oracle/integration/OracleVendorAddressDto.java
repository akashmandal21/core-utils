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
