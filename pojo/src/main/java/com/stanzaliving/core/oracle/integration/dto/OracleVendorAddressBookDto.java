package com.stanzaliving.core.oracle.integration.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleVendorAddressBookDto {

    @JsonProperty("items")
    private List<OracleVendorAddressDto> items; //set

}
